package com.zhengchalei.jimmerdemo

import org.babyfish.jimmer.sql.*

@Entity
@Table(name = "book")
interface Book : TenantAware {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int

    val name: String

    @ManyToOne
    @JoinColumn(name = "author_id")
    val author: Author
}
