/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.engine.impl.persistence.entity;

import java.util.Date;

import org.flowable.engine.common.impl.persistence.entity.Entity;
import org.flowable.engine.history.HistoricIdentityLink;

/**
 * @author Joram Barrez
 */
public interface HistoricIdentityLinkEntity extends HistoricIdentityLink, Entity {

    boolean isUser();

    boolean isGroup();

    void setType(String type);

    void setUserId(String userId);

    void setGroupId(String groupId);

    void setTaskId(String taskId);

    void setCreateTime(Date createTime);

    void setProcessInstanceId(String processInstanceId);

}
