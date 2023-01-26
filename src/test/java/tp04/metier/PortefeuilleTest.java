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

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tp04.metier.Portefeuille.LignePortefeuille;

/**
 *
 * @author Samba GUEYE
 */
public class PortefeuilleTest {
    
    public PortefeuilleTest() {
    }

    @Test
    public void testAcheter() {
        ActionSimple a = new ActionSimple("toto");
        int q = 100;
     
        Portefeuille p = new Portefeuille();
        p.acheter(a, q);
        
        Assertions.assertEquals(p.mapLignes.keySet().iterator().next().toString(), a.toString());
    }

    
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
 
  
    @Test
    public void vente_action_portefeuille() {
        Portefeuille pf = new Portefeuille();
        Action atos = new ActionSimple("atos");
        Action soprasteria = new ActionSimple("sopra");

        String lib = atos.getLibelle();

        //pf.mapLignes(atos, new LignePortefeuille(10));
        pf.acheter(soprasteria, 5);
        pf.acheter(atos, 10);

        pf.vendre(atos, 1);
        Assertions.assertEquals("atos", lib);

    }

    @Test
    public void vente_action_qte_portefeuille() {
        Portefeuille portefeuille = new Portefeuille();
        Action atos = new ActionSimple("atos");
        LignePortefeuille lignePortefeuille = portefeuille.new LignePortefeuille(atos, 0);

        portefeuille.mapLignes = new HashMap<Action, LignePortefeuille>();
        portefeuille.mapLignes.put(atos, lignePortefeuille);
        int qte = portefeuille.mapLignes.get(atos).getQte();
        portefeuille.acheter(atos, 10);
        portefeuille.vendre(atos, 15);
        Assertions.assertEquals(0, qte);

    }

    @Test
    public void vente_action_qte_egale_qte_vendu() {
        Portefeuille portefeuille = new Portefeuille();
        Action atos = new ActionSimple("atos");
        LignePortefeuille lignePortefeuille = portefeuille.new LignePortefeuille(atos, 0);
        portefeuille.mapLignes = new HashMap<Action, LignePortefeuille>();
        portefeuille.mapLignes.put(atos, lignePortefeuille);
        portefeuille.acheter(atos, 10);
        portefeuille.vendre(atos, 10);
        
        
        Action a= portefeuille.mapLignes.get(atos).getAction();
        //ici l'action atos n'existe plus donc le test retournera toujours null (fail)
        Assertions.assertNull(a);

    }

}
