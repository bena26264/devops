package tn.esprit.spring;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Skier;
import tn.esprit.spring.repositories.ISkierRepository;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class GestionStationSkiApplicationTests {
	private ISkierRepository skierRepository;

	@Test
	void contextLoads() {
	}

	@Test
	@Order(0)
	public void addSkierTest(Skier skier) {
		skier = skierRepository.save(skier);
		log.info(skier.toString());
		Assertions.assertNotNull(skier.getNumSkier());

	}

}
