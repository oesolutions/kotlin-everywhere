import components.ExpenseItem
import react.FC
import react.Props
import react.StrictMode
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2

val App = FC<Props> {
    StrictMode {
        div {
            h2 { +"Let's get started!" }
            ExpenseItem {}
        }
    }
}
