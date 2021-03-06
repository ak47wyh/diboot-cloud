/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.scheduler.mapper;

import com.diboot.core.mapper.BaseCrudMapper;
import com.diboot.scheduler.entity.ScheduleJob;
import org.apache.ibatis.annotations.Mapper;

/**
* 定时任务Job定义Mapper
* @author mazc@dibo.ltd
* @version 2.2
* @date 2020-11-27
*/
@Mapper
public interface ScheduleJobMapper extends BaseCrudMapper<ScheduleJob> {

}

