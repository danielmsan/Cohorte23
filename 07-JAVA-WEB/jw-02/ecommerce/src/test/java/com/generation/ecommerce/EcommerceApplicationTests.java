package com.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void pruebaGET() throws Exception {
        this.mockMvc.perform(get("/miOtzo/productos/1"))
        .andDo( print() )
        .andExpect( status().isOk() )
        .andExpect( content().string(
                containsString("papasSabritas.jpg")
                ) );
    
    
    }//pruebaGET
    
    @Test
    @Disabled("Deshabilitado porque ya fue probado")
    public void pruebaDelete() throws Exception {
        this.mockMvc.perform(delete("/miOtzo/productos/2"))
        .andDo( print() )
        .andExpect( status().isOk() ) ;

    }//pruebaDELETE
    
    
    
    @Test
    public void pruebaPOST() throws Exception {
        Producto p = new Producto();
        p.setNombre("Fanta");
        p.setDescripcion("refresco sabor naranja");
        p.setPrecio(20.3);
        p.setURL_Imagen("fanta.jpg");
        
        this.mockMvc.perform(post("/miOtzo/productos/")//el post va dirigido a un URL principal
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(p))) 
        .andDo( print() )
        .andExpect( status().isOk() )
        .andExpect( content().string(
                containsString("Fanta")
                ) );
        
    }//Prueba POST
    
    private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString
    
@Test
public void pruebaPUT() throws Exception {
    this.mockMvc.perform(put("/miOtzo/productos/1"))
    .andDo( print() )
    .andExpect( status().isOk() )
    .andExpect( content().string(
            containsString("producto_x.jpg")
            ) );
    
    

}