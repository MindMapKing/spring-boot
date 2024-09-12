import java.io.*;
import org.springframework.boot.maven.*;

Verify.verifyJar(
	new File(basedir, "target/jar-0.0.1.jar"), "some.random.Main", false
)
