/*
 * Copyright 2023 Nicolas Diaz.
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
 * @author Nicolas Diaz
 */
public class ActionSimpleTest {
    
    public ActionSimpleTest() {
    }

    @Test
    public void testEnrgCours() {
        System.out.println("TestEnrgCours");
        ActionSimple x = new ActionSimple("Nico");
        Jour y = new Jour (2023, 24);
        float v = 200.0F;
        x.enrgCours(y, v);
        
        float v1 = 200.0F;
        Assertions.assertEquals(v1, x.valeur(y));   
    }    
}
