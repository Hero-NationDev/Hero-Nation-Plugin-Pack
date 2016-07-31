package basicpackage;

	import net.md_5.bungee.api.ProxyServer;
	import net.md_5.bungee.api.plugin.Plugin;

	public class HiEnable extends Plugin {

	    @Override
	    public void onEnable() {
	        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Hi(this));
	    }
	}