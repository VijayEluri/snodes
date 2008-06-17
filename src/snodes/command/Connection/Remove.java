/* -*-    indent-tabs-mode:t; tab-width:4; c-basic-offset:4    -*- */
/*
 * Copyright (c) 2007-2008 Michael Schoonmaker <michael.r.schoonmaker@gmail.com>
 * Copyright (c) 2007-2008 Michael Dippery <mdippery@bucknell.edu>
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package snodes.command.Connection;

import snodes.command.Command;
import snodes.gui.GUIController;
import snodes.net.SnodesConnection;
import snodes.net.SnodesServer;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * The Connection.Remove command class.
 *
 * @author Michael Schoonmaker
 * @author <a href="mailto:mdippery@bucknell.edu">Michael Dippery</a>
 * @version 0.1
 */
public class Remove implements Command {
	/**
	 * Creates the instance. No instantiation needed.
	 *
	 */
	public Remove() {}
	
	/**
	 * Removes an existing connection via dialog box.
	 *
	 * @param actionCommand
	 *	The full ActionEvent command.
	 */
	public void run(String actionCommand) {
		SnodesConnection[] conns = GUIController.getInstance().getConnections();
		
		SnodesConnection conn = (SnodesConnection)GUIController.getInstance().showSelectionDialog(
			"Select the connection to remove",
			"Remove Connection",
			conns
		);
                GUIController.getInstance().invalidateHost(conn.getHost());
	}
}
