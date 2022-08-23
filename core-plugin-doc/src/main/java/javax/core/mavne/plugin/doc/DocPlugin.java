package javax.core.mavne.plugin.doc;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "doc",defaultPhase = LifecyclePhase.PACKAGE)
public class DocPlugin extends AbstractMojo {

    @Parameter
    private String applicationName;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("自己的第一个maven插件");
        getLog().info("my doc-->" + applicationName);
    }

}
