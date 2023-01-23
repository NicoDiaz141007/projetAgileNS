/*
 * Copyright 2023 zahra.
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


/**
 *
 * @author zahra
 */
public class US1TestPortefeuilleCisseGonda {

    @Test
    public void testValeurActionSimple() {
        Jour j = new Jour(2022, 1);
        ActionSimple as = new ActionSimple("Action1");
        as.enrgCours(j, 10);
        float expectedValue = 10;
        float actualValue = as.valeur(j);
        Assertions.assertEquals(expectedValue, actualValue, 0.001);
    }
    
    
    @Test
    public void testValeurActionComposee() {
        Jour j = new Jour(2022, 1);
        ActionSimple as1 = new ActionSimple("Action1");
        ActionSimple as2 = new ActionSimple("Action2");
        as1.enrgCours(j, 10);
        as2.enrgCours(j, 20);
        ActionComposee ac = new ActionComposee("ComposedAction");
        ac.enrgComposition(as1, 0.5f);
        ac.enrgComposition(as2, 0.5f);
        float expectedValue = 15;
        float actualValue = ac.valeur(j);
        Assertions.assertEquals(expectedValue, actualValue, 0.001);
    }


}
