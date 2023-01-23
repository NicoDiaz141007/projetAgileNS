/*
 * Copyright 2023 crist.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp04.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author crist
 */
public class PortefeuilleTest {
    
    public PortefeuilleTest() {
    }

    @Test
    public void testAcheter() {
        System.out.println("acheter");
        Action a = null;
        int q = 0;
        Portefeuille instance = new Portefeuille();
        instance.acheter(a, q);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVendre() {
        System.out.println("vendre");
        Action a = null;
        int q = 0;
        Portefeuille instance = new Portefeuille();
        instance.vendre(a, q);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Portefeuille instance = new Portefeuille();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testValeur() {
        System.out.println("valeur");
        Jour j = null;
        Portefeuille instance = new Portefeuille();
        float expResult = 0.0F;
        float result = instance.valeur(j);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void test_portefeuille_vente_action() {
        Portefeuille pf = new Portefeuille();
        Action atos = new ActionSimple("atos");
        Action soprasteria = new ActionSimple("sopra");
        
        String lib= atos.getLibelle();
        
        //pf.mapLignes(atos, new LignePortefeuille(10));
        pf.acheter(soprasteria, 5);
        pf.acheter(atos, 10);

        pf.vendre(atos, 1);
        Assertions.assertEquals("atos", lib);
    
}
}
