package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2

val ExpenseItem = FC<Props> {
    div {
        div { +"Date" }
        div {
            h2 { +"Title" }
            div { +"Amount" }
        }
    }
}
