package io.github.oesolutions.react

import csstype.NamedColor
import emotion.react.css
import io.github.oesolutions.shared.Greeter
import react.FC
import react.Props
import react.dom.events.MouseEventHandler
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.useState
import web.html.HTMLDivElement

val Greeting = FC<GreetingProps> { props ->
    var clicked: Boolean by useState(false)

    val clickedHandler: MouseEventHandler<HTMLDivElement> = {
        clicked = !clicked
    }

    h1 {
        +"Greetings"
    }
    div {
        css {
            backgroundColor = if (clicked) NamedColor.red else NamedColor.yellow
        }
        onClick = clickedHandler
        +Greeter().greet(props.name)
    }
}

external interface GreetingProps : Props {
    var name: String
}
