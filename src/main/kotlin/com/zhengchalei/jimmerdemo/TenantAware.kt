package com.zhengchalei.jimmerdemo

import org.babyfish.jimmer.sql.MappedSuperclass


@MappedSuperclass
interface TenantAware {
    val tenantId: Int
}

