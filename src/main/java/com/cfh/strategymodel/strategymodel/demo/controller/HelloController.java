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


package com.cfh.strategymodel.strategymodel.demo.controller;

import com.cfh.strategymodel.strategymodel.demo.component.StrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * 请求
 *
 * @author cai.fenghua
 * @date 2020-08-19
 * @since 1.0.0
 */
@Controller
@RequestMapping
public class HelloController {
    @Autowired
    private StrategyContext strategyContext;

    @RequestMapping("calculatePrice")
    public @ResponseBody
    BigDecimal calculatePrice(String memberLevel) {
        return strategyContext.calculatePrice(memberLevel);
    }
}
