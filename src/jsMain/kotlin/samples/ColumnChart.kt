package samples

import externals.echarts.BarSeriesOption
import externals.echarts.EChartsOption
import externals.echarts.ZRender
import kafffe.core.KafffeComponent
import kafffe.core.KafffeHtmlBase
import kafffe.core.KafffeHtmlOut
import kafffe.utils.DomObserverUtils
import org.w3c.dom.HTMLDivElement

class ColumnChart() : KafffeComponent() {
    init {
        // TODO how do we handle javascript code that needs to be on rendered elements.
//        attachAwareModifier(onAttach = {
//            window.setTimeout({ chart() }, 200)
//        })
    }

    fun <T> jsObject(block: T.() -> Unit = {}): T {
        val o: T = js("{}").unsafeCast<T>()
        o.block()
        return o
    }

    fun chart(chartElement: HTMLDivElement) {
        var myChart: ZRender = externals.echarts.init(chartElement)
        var option: EChartsOption = js(
            """{
                    xAxis : {
                    type: 'category',
                    data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
                },
                    yAxis: {
                        type: 'value'
                },
                  legend: {
                    data: ['2023', '2024', '2025']
                    },
                    series: [
                    {
                        name: '2023',
                        data: [120, 200, 150, 80, 70, 110, 130],
                        type: 'bar'
                    }, {
                        name: '2024',
                        data: [120, 200, 150, 80, 70, 110, 130],
                        type: 'bar',
                        barGap: '-35%'
                    }
                    ]
                }                
            """
        ).unsafeCast<EChartsOption>()
        val barSeriesOptions = (option.series as Array<BarSeriesOption>)
        barSeriesOptions[2] = js("{}") as BarSeriesOption
        barSeriesOptions[2].name = "2025"
        barSeriesOptions[2].type = "bar"
        barSeriesOptions[2].barGap = "-35%"
        barSeriesOptions[2].data = (1..7).map { randomCount() }.toTypedArray()
        option.series[0].data = (1..7).map { randomCount() }.toTypedArray()
        option.series[1].data = (1..7).map { randomCount() }.toTypedArray()
        myChart.setOption(option)
    }
    private fun randomCount(): Int = (1..100).random()

    override fun KafffeHtmlBase.kafffeHtml(): KafffeHtmlOut =
        div {
            div {
                withElement {
                    style.height = "500px"
                    style.width = "500px"
                }
                DomObserverUtils.whenVisibleInViewport(this.element) {
                    chart(it)
                }
           }
           div {
                withElement {
                    style.height = "500px"
                    style.width = "500px"
                }
               DomObserverUtils.firstVisibleInViewport(this.element) {
                    chart(it)
                }
            }
        }
}

