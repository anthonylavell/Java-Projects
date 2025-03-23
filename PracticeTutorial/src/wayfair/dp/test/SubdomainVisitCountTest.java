package wayfair.dp.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.dp.SubdomainVisitCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubdomainVisitCountTest {
    @Test
    public void testSubdomainVisits(){
        String [] cpDomains = {"654 yaw.lmm.ca","1225 lmm.ca"};
        List<String>listOfResults = new ArrayList<>(Arrays.asList("654 yaw.lmm.ca","1879 lmm.ca","1879 ca"));
        Assertions.assertEquals(listOfResults, SubdomainVisitCount.subdomainVisits(cpDomains));

        String [] cpDomains2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String>listOfResults2 = new ArrayList<>(Arrays.asList("951 com", "900 google.mail.com", "1 intel.mail.com", "5 org", "5 wiki.org", "901 mail.com", "50 yahoo.com"));

        Assertions.assertEquals(listOfResults2, SubdomainVisitCount.subdomainVisits(cpDomains2));
    }

}