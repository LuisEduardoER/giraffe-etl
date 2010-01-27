/*
   Copyright 2010 Computer and Automation Research Institute, Hungarian Academy of Sciences (SZTAKI)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hu.sztaki.ilab.giraffe.dataprocessors.useragent;
import java.util.*;

/**
 *
 * @author neumark
 */
public class SwitchParameters {   
       
   
   
    private AgentInfo agentid; 
    private Vector<AgentInfo> agentDetails; 
    private WordLocation loc;
    public SwitchParameters(AgentInfo ai, Vector<AgentInfo> ad, WordLocation l)
    {
        loc = l;
        agentid = ai;
        agentDetails = ad;
    }
    public AgentInfo getAgentId() {return agentid; }
    public Vector<AgentInfo> getAgentDetails() {return agentDetails;  }
    public WordLocation getLocation() {return loc;}   
}
