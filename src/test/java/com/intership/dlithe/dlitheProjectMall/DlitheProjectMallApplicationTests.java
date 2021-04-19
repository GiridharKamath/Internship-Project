package com.intership.dlithe.dlitheProjectMall;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Vector;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class DlitheProjectMallApplicationTests {

	@MockBean
	ProductRepository repo;
	@Autowired
	ProductService serv;
	
	@Test
	public void testAdd()
	{
		Product pro=new Product(1,"munch",10,5.0,50.0);
		Product pr=new Product();
		
		when(repo.save(pro)).thenReturn(pro);
		assertEquals(pro, serv.newadd(pro));
		assertNull(serv.newadd(pr));
		
		Product pro2=new Product(17,"Perk",10,5.0,50.0);
		when(repo.save(pro2)).thenReturn(pro2);
		assertTrue(serv.newadd(pro2).getPid()==17);
	}
	
	@Test
	public void testIterate()
	{
		List<Product> storage=new Vector<Product>();
		Product pro1=new Product(11,"Perk1",10,5.0,50.0);
		Product pro2=new Product(12,"Perk2",10,5.0,50.0);
		Product pro3=new Product(13,"Perk3",10,5.0,50.0);
		storage.add(pro1);storage.add(pro2);storage.add(pro3);
		
		when(repo.findAll()).thenReturn(storage);
		assertTrue(serv.every().get(0).getTotal()>=40.0);
		assertNotNull(serv.every().get(2));
	}
	
	@Test
	public void testUpdate()
	{
		Product pro1=new Product(3,"P3",10,5.0,50.0);
		Product pro2=new Product(4,"P4",11,5.0,55.0);
		when(repo.save(pro1)).thenReturn(pro1);
		assertEquals(pro1, serv.alter(pro1));
		when(repo.save(pro2)).thenReturn(pro2);
		assertTrue(serv.alter(pro1).getQuantity()<=pro2.getQuantity());
	}

	
	@Test
	public void testDelete()
	{
		Product pro1=new Product(3,"P3",10,5.0,50.0);
		Product pro2=new Product(5,"P5",10,5.0,50.0);
		assertSame(pro2.getPname(),serv.remove(pro2));
		assertSame(pro1.getPname(),serv.remove(pro1));
	}
}
