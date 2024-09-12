import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertFalse

File f = new File(basedir, "target/jar-skip-0.0.1.jar")
assertTrue 'output file should have been generated', f.exists()
File shouldNotExist = new File(basedir, "target/jar-skip-0.0.1.jar.original")
assertFalse 'repackage goal should not have run. .original should not exist', shouldNotExist.exists()
