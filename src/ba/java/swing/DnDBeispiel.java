package ba.java.swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;

import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class DnDBeispiel extends JFrame {

  JTree tree;

  public DnDBeispiel() {
    super("JTreeDragNDropExample");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    tree = new JTree();

    tree.setDragEnabled(true);
    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
    tree.setDropMode(DropMode.USE_SELECTION);
    tree.setDropTarget(new DropTarget(tree, TransferHandler.MOVE, new DropTargetAdapter() {
      @Override
      public void drop(DropTargetDropEvent dtde) {

        TreePath selectionPath = tree.getSelectionPath();
        TreePath sourcePath = selectionPath.getParentPath();

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectionPath.getLastPathComponent();

        Point dropLocation = dtde.getLocation();
        TreePath targetPath = tree.getClosestPathForLocation(dropLocation.x, dropLocation.y);

        System.out.println("###################");

        System.out.println("srcPath: " + sourcePath);
        System.out.println("targetPath: " + targetPath);
        System.out.println("selectedNode: " + selectedNode);

        if (isDropAllowed(sourcePath, targetPath, selectedNode)) {
          System.out.println("drop accept");
          DefaultMutableTreeNode targetParentNode = (DefaultMutableTreeNode) targetPath.getLastPathComponent();
          DefaultMutableTreeNode sourceParentNode = (DefaultMutableTreeNode) sourcePath.getLastPathComponent();

          sourceParentNode.remove(selectedNode);
          targetParentNode.add(selectedNode);

          dtde.dropComplete(true);
          tree.updateUI();
        } else {
          System.out.println("drop: reject");
          dtde.rejectDrop();
          dtde.dropComplete(false);
        }
      }

      private boolean isDropAllowed(TreePath sourcePath, TreePath targetPath, DefaultMutableTreeNode selectedNode) {
        if (((DefaultMutableTreeNode) sourcePath.getLastPathComponent()).isLeaf()) {
        } else if (targetPath.equals(sourcePath)) {
          return false;
        }
        return selectedNode.isLeaf();
      }

    }));

    for (int currentRowIndex = 0; currentRowIndex < tree.getRowCount(); currentRowIndex++) {
      tree.expandRow(currentRowIndex);
    }

    JScrollPane scrollPane = new JScrollPane(tree);
    scrollPane.setPreferredSize(new Dimension(400, 100));

    add(scrollPane);

    pack();
    setVisible(true);

  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    new DnDBeispiel();
  }
}