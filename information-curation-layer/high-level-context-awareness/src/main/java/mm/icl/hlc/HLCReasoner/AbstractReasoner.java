/**
* 
* Copyright [2016] [Claudia Villalonga & Muhammad Asif Razzaq]
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software distributed under 
* the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
*  ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and limitations under the License.
*/
package mm.icl.hlc.HLCReasoner;

import mm.icl.hlc.OntologyTools.NutritionContext;
import mm.icl.hlc.OntologyTools.PhysicalActivityContext;
/**
 * Abstract Reasoner contains all Function required by Reasoners
 * for reasoning purpose. It provides Most Common methods for 
 * re-use purpose by implementing Pattern
 * 
 * @author Muhammad Asif Razzaq
 * @version 2.5
 * @since 2016-10-28
 */
public abstract class AbstractReasoner {
	
	public abstract PhysicalActivityContext inferHlc(PhysicalActivityContext unclassified);
	public abstract NutritionContext inferHlc(NutritionContext unclassified);
}
