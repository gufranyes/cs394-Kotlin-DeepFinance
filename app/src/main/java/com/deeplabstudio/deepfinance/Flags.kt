package com.deeplabstudio.deepfinance

class Flags {

    fun GetName(name:String):String{
        when(name){
            "GA"->{
                return "Gram Altın"
            }
            "C"->{
                return "Çeyrek Altın"
            }
            "Y"->{
                return "Yarım Altın"
            }
            "T"->{
                return "Tam Altın"
            }
            "CMR"->{
                return "Cumhuriyet Altını"
            }
            "XAU/USD"->{
                return "ONS Altın"
            }
            "ATA"->{
                return "Ata Altın"
            }
            "14"->{
                return "14 Ayar Altın"
            }
            "18"->{
                return "18 Ayar Altın"
            }
            "22"->{
                return "22 Ayar Altın"
            }
            "GR"->{
                return "Gremse Altın"
            }
            "GAG"->{
                return "Gümüş"
            }
            "BSL"->{
                return "Beşli Altın"
            }
            "IKB"->{
                return "İkibuçuk Altın"
            }
            "HA"->{
                return "Hamit Altın"
            }
            "XAUEUR"->{
                return "ONS Altın/EUR"
            }
            else->{
                return name
            }
        }
        return ""
    }

    fun getFlags(name:String):Int{
        val flags:ArrayList<Flag> = ArrayList()
        flags.add(Flag("USD", R.drawable.usd))
        flags.add(Flag("EUR", R.drawable.eur))
        flags.add(Flag("GBP", R.drawable.gbp))
        flags.add(Flag("CHF", R.drawable.chf))
        flags.add(Flag("CAD", R.drawable.cad))
        flags.add(Flag("RUB", R.drawable.rub))
        flags.add(Flag("AED", R.drawable.aed))
        flags.add(Flag("AUD", R.drawable.aud))
        flags.add(Flag("DKK", R.drawable.dkk))
        flags.add(Flag("SEK", R.drawable.sek))
        flags.add(Flag("NOK", R.drawable.nok))
        flags.add(Flag("JPY", R.drawable.jpy))
        flags.add(Flag("KWD", R.drawable.kwd))
        flags.add(Flag("ZAR", R.drawable.zar))
        flags.add(Flag("OMR", R.drawable.omr))
        flags.add(Flag("MYR", R.drawable.myr))
        flags.add(Flag("PHP", R.drawable.php))
        flags.add(Flag("QAR", R.drawable.qar))
        flags.add(Flag("SYP", R.drawable.syp))
        flags.add(Flag("RSD", R.drawable.rsd))
        flags.add(Flag("UAH", R.drawable.uah))
        flags.add(Flag("TWD", R.drawable.twd))
        flags.add(Flag("MDL", R.drawable.mdl))
        flags.add(Flag("PEN", R.drawable.pen))
        flags.add(Flag("SGD", R.drawable.sgd))
        flags.add(Flag("MKD", R.drawable.mkd))
        flags.add(Flag("UYU", R.drawable.uyu))
        flags.add(Flag("PKR", R.drawable.pkr))
        flags.add(Flag("THB", R.drawable.thb))
        flags.add(Flag("SAR", R.drawable.sar))
        flags.add(Flag("ILS", R.drawable.ils))
        flags.add(Flag("BHD", R.drawable.bhd))
        flags.add(Flag("MXN", R.drawable.mxn))
        flags.add(Flag("NZD", R.drawable.nzd))
        flags.add(Flag("IRR", R.drawable.irr))
        flags.add(Flag("CSK", R.drawable.csk))
        flags.add(Flag("BGN", R.drawable.bgn))
        flags.add(Flag("ARS", R.drawable.ars))
        flags.add(Flag("BRL", R.drawable.brl))
        flags.add(Flag("AZN", R.drawable.azn))
        flags.add(Flag("CLP", R.drawable.clp))
        flags.add(Flag("RON", R.drawable.ron))
        flags.add(Flag("CRC", R.drawable.crc))
        flags.add(Flag("HKD", R.drawable.sar))
        flags.add(Flag("BAM", R.drawable.bam))
        flags.add(Flag("ISK", R.drawable.isk))
        flags.add(Flag("KZT", R.drawable.kzt))
        flags.add(Flag("LKR", R.drawable.lkr))
        flags.add(Flag("DZD", R.drawable.dzd))
        flags.add(Flag("MAD", R.drawable.mad))
        flags.add(Flag("JOD", R.drawable.jod))
        flags.add(Flag("LTL", R.drawable.ltl))
        flags.add(Flag("LYD", R.drawable.lyd))
        flags.add(Flag("INR", R.drawable.inr))
        flags.add(Flag("IDR", R.drawable.idr))
        flags.add(Flag("IQD", R.drawable.iqd))
        flags.add(Flag("CNY", R.drawable.cny))
        flags.add(Flag("HUF", R.drawable.huf))
        flags.add(Flag("BYR", R.drawable.byr))
        flags.add(Flag("PLN", R.drawable.pln))
        flags.add(Flag("EGP", R.drawable.egp))
        flags.add(Flag("ALL", R.drawable.all))
        flags.add(Flag("KRW", R.drawable.krw))
        flags.add(Flag("COP", R.drawable.cop))
        flags.add(Flag("LVL", R.drawable.lvl))
        flags.add(Flag("HRK", R.drawable.hrk))
        flags.add(Flag("LBP", R.drawable.lbp))
        flags.add(Flag("GEL", R.drawable.gel))
        flags.add(Flag("TND", R.drawable.tnd))
        val position = flags.indexOfFirst { it.name == name }
        if (position == -1) return R.drawable.gold
        return flags.get(position).int
    }

    data class Flag(val name: String, val int:Int)
}
