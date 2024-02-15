package com.testing;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @Test
    public void testGetAllProducts() throws Exception {
        // Implement your test scenario
    }

    @Test
    public void whenGetAllProducts_thenStatus200() throws Exception {
        List<Product> productList = Arrays.asList(new Product(), new Product());
        when(productRepository.findAll()).thenReturn(productList);

        mockMvc.perform(get("/api/products"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.length()", is(productList.size())));
    }
}
