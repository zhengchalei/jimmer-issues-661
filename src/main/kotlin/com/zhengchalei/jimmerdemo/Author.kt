package com.zhengchalei.jimmerdemo

import org.babyfish.jimmer.sql.*

@Entity
@Table(name = "author")
interface Author : TenantAware {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int

    val name: String
}