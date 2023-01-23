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
public class TestProf {
    
    @Test
            
    public void testenregistrementcoursreturnok(){
        
        final ActionSimple as = new ActionSimple("toto");
        final Jour j1 = new Jour(0,0);
        final float value = 1.37F;
        as.enrgCours(j1,value);
        
        final float result = as.valeur(j1);
        Assertions.assertEquals(value, result);

        
    }

    



    
}
