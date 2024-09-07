package com.zhengchalei.jimmerdemo

import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.babyfish.jimmer.sql.kt.filter.KAssociationIntegrityAssuranceFilter
import org.babyfish.jimmer.sql.kt.filter.KFilterArgs
import org.springframework.stereotype.Component

@Component
class TenantFilter : KAssociationIntegrityAssuranceFilter<TenantAware> {

    override fun filter(args: KFilterArgs<TenantAware>) {
        1?.let {
            args.apply {
                where(table.tenantId.eq(it))
            }
        }
    }
}
