package basicpackage;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;


class Hi extends Command {


    public Hi(HiEnable This) {
        super("command", "permission");
    }

    @SuppressWarnings("deprecation")
	public void execute(CommandSender sender, String[] args) {
        if ((sender instanceof ProxiedPlayer)) {
          ProxiedPlayer p = (ProxiedPlayer)sender;
          if (p.hasPermission("heronationpluginpack.hi"))
              p.sendMessage(ChatColor.GOLD + "Created your project! :)");
              }
          }
    }
