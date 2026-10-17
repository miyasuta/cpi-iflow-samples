import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {
    def greeting = message.getHeaders().get("X-X02-Greeting") ?: ""
    message.setHeader("X-X02-Script", "set-by-script")
    message.setBody(greeting.toString().toUpperCase())
    return message
}
