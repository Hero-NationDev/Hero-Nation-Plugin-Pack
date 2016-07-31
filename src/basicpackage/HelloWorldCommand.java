package basicpackage;

import net.md_5.bungee.api.CommandSender;

public class HelloWorldCommand {
	 public HelloWorldCommand() {
	      super("helloworld");
	      
	      @Override
	      public void execute(CommandSender commandSender, String[] strings) {
	          commandSender.sendMessage(new ComponentBuilder("Hello world!").color(ChatColor.GREEN).create());
	          getProxy().getPluginManager().registerCommand(this, new HelloWorldCommand());
	      }
	  }
}
