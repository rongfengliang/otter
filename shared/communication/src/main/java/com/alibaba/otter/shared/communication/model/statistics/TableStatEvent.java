/*
 * Copyright (C) 2010-2101 Alibaba Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.otter.shared.communication.model.statistics;

import java.util.List;

import com.alibaba.otter.shared.common.model.statistics.table.TableStat;
import com.alibaba.otter.shared.communication.core.model.Event;

/**
 * table stat事件
 * 
 * @author jianghang
 */
public class TableStatEvent extends Event {

    private static final long serialVersionUID = -5925977847006864387L;

    public TableStatEvent(){
        super(StatisticsEventType.tableStat);

    }

    private List<TableStat> stats;

    public List<TableStat> getStats() {
        return stats;
    }

    public void setStats(List<TableStat> stats) {
        this.stats = stats;
    }

}
