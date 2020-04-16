package LoggerSample

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class App : RequestHandler<Any?, Any> {
    private val logger: Logger = LogManager.getLogger(App::class.java)
    override fun handleRequest(input: Any?, context: Context) {
        logger.info("log data from log4j info.")
        logger.debug("log data from log4j debug.")
        logger.warn("log data from log4j warn.")
        logger.error("log data from log4j err.")
        logger.error("log data from log4j err and stack trace.", IllegalArgumentException("Test"))
    }
}
