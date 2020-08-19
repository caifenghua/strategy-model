/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2020.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2020-08-19             cai.fenghua   Create the class
 * http://www.jimilab.com/
 */


package com.cfh.strategymodel.strategymodel.demo.component;

import com.cfh.strategymodel.strategymodel.demo.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 控制器
 *
 * @author cai.fenghua
 * @date 2020-08-19
 * @since 1.0.0
 */
@Component
public class StrategyContext {

    // 定义一个map
    private final Map<String, Strategy> strategyMap = new ConcurrentHashMap<>();

    @Autowired
    public StrategyContext(Map<String, Strategy> strategyMap) {
        this.strategyMap.clear();
        strategyMap.forEach((k, v)-> this.strategyMap.put(k, v));
    }

    // 分配（注意异常处理，找不到相应的service）
    public BigDecimal calculatePrice(String memberLevel) {
        if(!StringUtils.isEmpty(memberLevel)){
            return strategyMap.get(memberLevel).calculatePrice();
        }
        return null;
    }

}
