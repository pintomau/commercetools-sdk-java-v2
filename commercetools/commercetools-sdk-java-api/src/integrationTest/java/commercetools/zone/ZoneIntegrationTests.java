
package commercetools.zone;

import static commercetools.zone.ZoneFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.zone.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ZoneIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Zone zone = createZone();
        Zone deletedZone = deleteZone(zone.getId(), zone.getVersion());

        Assert.assertNotNull(deletedZone);
        Assert.assertEquals(zone.getId(), deletedZone.getId());
    }

    @Test
    public void getById() {
        withZone(zone -> {
            Zone queriedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withId(zone.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedZone);
            Assert.assertEquals(zone.getId(), queriedZone.getId());
        });
    }

    @Test
    public void getByKey() {
        withZone(zone -> {
            Zone queriedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withKey(zone.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedZone);
            Assert.assertEquals(zone.getId(), queriedZone.getId());
        });
    }

    @Test
    public void query() {
        withZone(zone -> {
            ZonePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .get()
                    .withWhere("id=" + "\"" + zone.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), zone.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableZone(zone -> {
            List<ZoneUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ZoneSetKeyActionBuilder.of().key(newKey).build());

            Zone updatedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withId(zone.getId())
                    .post(ZoneUpdateBuilder.of().actions(updateActions).version(zone.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedZone);
            Assert.assertEquals(updatedZone.getKey(), newKey);

            return updatedZone;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableZone(zone -> {
            List<ZoneUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(ZoneSetKeyActionBuilder.of().key(newKey).build());

            Zone updatedZone = CommercetoolsTestUtils.getProjectApiRoot()
                    .zones()
                    .withKey(zone.getKey())
                    .post(ZoneUpdateBuilder.of().actions(updateActions).version(zone.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedZone);
            Assert.assertEquals(updatedZone.getKey(), newKey);

            return updatedZone;
        });
    }

    @Test
    public void deleteByKey() {
        Zone zone = createZone();
        Zone deletedZone = deleteZone(zone.getId(), zone.getVersion());

        Assert.assertNotNull(deletedZone);
        Assert.assertEquals(zone.getId(), deletedZone.getId());
    }

}
