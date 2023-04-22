import react.create
import react.dom.client.createRoot
import web.dom.document

fun main() {
    val container = document.getElementById("root") ?: error("Could not find root container!")
    createRoot(container).render(App.create {
    })
}
