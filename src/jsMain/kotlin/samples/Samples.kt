package samples

import kafffe.bootstrap.*
import kafffe.bootstrap.navigation.Nav
import kafffe.core.Model
import kafffe.core.NavigationElement
import kafffe.core.NavigationPath
import kafffe.core.ServiceRegistry
import kafffe.core.modifiers.HtmlElementModifier
import kafffe.messages.Messages_da
import kafffe.messages.Messages_en
import kotlinx.browser.window
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.get

fun initServices() {
    ServiceRegistry.register("msg_en", Messages_en())
    ServiceRegistry.register("msg_da", Messages_da())
}

@OptIn(ExperimentalJsExport::class)
@JsExport
fun init_charts_samples_ui() {
    initServices()

    window.onload = {
        val rootNavigation = NavigationElement.create("root") {
            component("column") { ColumnChart() }
        }
        BootstrapRoot().apply {
            val container = BootstrapContainer.fluid()
            rootNavigation.componentNavigator = { container.replaceContent(it) }
            addChild(Nav.create(rootNavigation) {
                addExpand(ResponsiveSize.md)
                style = ColorStrength.dark
                //backgroundColor = "#4bb7e5"
                background = BasicColor.primary
                brand("", "images/BrandLogo.png").apply { modifiers.add(HtmlElementModifier.create { (this.getElementsByTagName("img")[0] as HTMLImageElement).style.maxHeight = "3rem" }) }
                toggle("menuToggle")
                toggleBlock("menuToggle") {
                    item(Model.of("Column Chart"), NavigationPath.fromString("root/column"), "fas fa-chart")
                }
            })
            addChild(container)
            attach()
            rootNavigation.navigateTo(NavigationPath.fromString("root/column"))
        }

    }
}

