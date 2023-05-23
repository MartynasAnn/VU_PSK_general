package lt.vu.services;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;
import java.util.Random;


//Cia yra alternatyva
@ApplicationScoped
@Alternative
//@Specializes
public class DivisionNumberGenerator implements NumberGenerator{

    @Override
    public Integer generateJerseyNumber() {
        try {
            Thread.sleep(3000); // Simulate intensive work
        } catch (InterruptedException e) {
        }
        Integer generatedJerseyNumber = new Random().nextInt(10);
        return generatedJerseyNumber;
    }
}
