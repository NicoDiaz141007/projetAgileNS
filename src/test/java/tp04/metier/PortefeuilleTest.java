/*
 * Copyright 2023 Samba GUEYE.
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

//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Samba GUEYE
 */
public class PortefeuilleTest {
    
    public PortefeuilleTest() {
    }

    /*@Test
    public void testAcheter() {
        ActionSimple a = new ActionSimple("toto");
        int q = 100;
     
        Portefeuille p = new Portefeuille();
        p.acheter(a, q);
        
        Assertions.assertEquals(p.mapLignes.keySet().iterator().next().toString(), a.toString());
    }*/

    
    @Test
    public void testSommePortefeuille() {
        ActionSimple action = new ActionSimple("BPCE");
        ActionSimple action1 = new ActionSimple("AXA");
        int q = 200;
        int q1=400;
     
        Portefeuille p = new Portefeuille();
        
        
        Jour j = new Jour(2023,10);
        action.enrgCours(j, 0.2F);
        action1.enrgCours(j, 0.2F);
        p.acheter(action, q);
        p.acheter(action1, q1);
        
        Float v1 = 120F;
        
        System.out.println(p.valeur(j));
        Assertions.assertEquals(p.valeur(j), v1);
    }
 
    
}