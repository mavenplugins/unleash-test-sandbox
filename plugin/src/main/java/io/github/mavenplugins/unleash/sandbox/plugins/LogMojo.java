package io.github.mavenplugins.unleash.sandbox.plugins;

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "logMessages", defaultPhase = LifecyclePhase.INITIALIZE)
public class LogMojo extends AbstractMojo {

  /**
   * List of messages to log for DEBUG level
   */
  @Parameter
  private List<String> debugLogs = new ArrayList<String>();

  /**
   * List of messages to log for INFO level
   */
  @Parameter
  private List<String> infoLogs = new ArrayList<String>();

  /**
   * List of messages to log for ERROR level
   */
  @Parameter
  private List<String> errorLogs = new ArrayList<String>();

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    this.debugLogs.forEach(msg -> getLog().debug(msg));
    this.infoLogs.forEach(msg -> getLog().info(msg));
    this.errorLogs.forEach(msg -> getLog().error(msg));
  }

}
