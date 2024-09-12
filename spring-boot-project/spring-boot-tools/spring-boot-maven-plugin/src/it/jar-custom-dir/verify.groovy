import java.io.*;
import org.springframework.boot.maven.*;

Verify.verifyJar(
	new File(basedir, "target/foo/jar-custom-dir-0.0.1.jar"), "some.random.Main"
)

Verify.verifyJar(
	new File(localRepositoryPath, "org/springframework/boot/maven/it/jar-custom-dir/0.0.1/jar-custom-dir-0.0.1.jar"), "some.random.Main"
)
