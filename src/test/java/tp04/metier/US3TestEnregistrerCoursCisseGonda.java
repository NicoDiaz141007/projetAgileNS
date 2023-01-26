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
public class US3TestEnregistrerCoursCisseGonda {

        @Test
        public void testEnregistrerCours() {
            //Création d'une instance de ActionSimple
            final ActionSimple action = new ActionSimple("Action 1");
            //Création d'une instance de Jour pour le 1er janvier 2022
            final Jour jour = new Jour(2022, 1);
            //Définition de la valeur de l'action pour ce jour
            float valeur = 100.0f;

            //Enregistrement de la valeur pour ce jour
            action.enrgCours(jour, valeur);
            //Vérification si la valeur est correctement enregistrée pour ce jour
            Assertions.assertEquals(valeur, action.valeur(jour), 0.1);
        }

}
