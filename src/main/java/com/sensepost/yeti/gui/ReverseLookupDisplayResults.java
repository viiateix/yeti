package com.sensepost.yeti.gui;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.sensepost.yeti.common.Globals;
import com.sensepost.yeti.common.UtilFunctions;
import com.sensepost.yeti.models.CertModel;
import com.sensepost.yeti.models.ReverseLookupModel;
import com.sensepost.yeti.reports.ResultExport;
import com.sensepost.yeti.persistence.DataStore;

/**
 *
 * @author willemmouton
 */
public class ReverseLookupDisplayResults extends javax.swing.JPanel implements DisplayResultIFace {

    /**
     * Creates new form reverseLookupDisplayResults
     */
    public ReverseLookupDisplayResults() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmOptions = new javax.swing.JPopupMenu();
        miOpenBrowser = new javax.swing.JMenuItem();
        miWhois = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSelectKnownDomains = new javax.swing.JMenuItem();
        miSelectAll = new javax.swing.JMenuItem();
        miUnselectAll = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miSelectAllFromDomain = new javax.swing.JMenuItem();
        miUnselectFromDomain = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btnTrimUnchecked = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnPersist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();

        pmOptions.setName("pmOptions"); // NOI18N

        miOpenBrowser.setText("Open browser"); // NOI18N
        miOpenBrowser.setName("miOpenBrowser"); // NOI18N
        miOpenBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenBrowserActionPerformed(evt);
            }
        });
        pmOptions.add(miOpenBrowser);

        miWhois.setText("Whois"); // NOI18N
        miWhois.setName("miWhois"); // NOI18N
        miWhois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWhoisActionPerformed(evt);
            }
        });
        pmOptions.add(miWhois);

        jSeparator1.setName("jSeparator1"); // NOI18N
        pmOptions.add(jSeparator1);

        miSelectKnownDomains.setText("Select known domains"); // NOI18N
        miSelectKnownDomains.setName("miSelectKnownDomains"); // NOI18N
        miSelectKnownDomains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectKnownDomainsActionPerformed(evt);
            }
        });
        pmOptions.add(miSelectKnownDomains);

        miSelectAll.setText("Select all"); // NOI18N
        miSelectAll.setName("miSelectAll"); // NOI18N
        miSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllActionPerformed(evt);
            }
        });
        pmOptions.add(miSelectAll);

        miUnselectAll.setText("Unselect all"); // NOI18N
        miUnselectAll.setName("miUnselectAll"); // NOI18N
        miUnselectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnselectAllActionPerformed(evt);
            }
        });
        pmOptions.add(miUnselectAll);

        jSeparator2.setName("jSeparator2"); // NOI18N
        pmOptions.add(jSeparator2);

        miSelectAllFromDomain.setText("Select all from this domain"); // NOI18N
        miSelectAllFromDomain.setName("miSelectAllFromDomain"); // NOI18N
        miSelectAllFromDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSelectAllFromDomainActionPerformed(evt);
            }
        });
        pmOptions.add(miSelectAllFromDomain);

        miUnselectFromDomain.setText("Unselect all from this domain"); // NOI18N
        miUnselectFromDomain.setName("miUnselectFromDomain"); // NOI18N
        miUnselectFromDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnselectFromDomainActionPerformed(evt);
            }
        });
        pmOptions.add(miUnselectFromDomain);

        setName("Form"); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        btnTrimUnchecked.setText("Clear unselected"); // NOI18N
        btnTrimUnchecked.setFocusable(false);
        btnTrimUnchecked.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrimUnchecked.setName("btnTrimUnchecked"); // NOI18N
        btnTrimUnchecked.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrimUnchecked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrimUncheckedMouseClicked(evt);
            }
        });
        jToolBar1.add(btnTrimUnchecked);

        btnExport.setText("Export"); // NOI18N
        btnExport.setFocusable(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setName("btnExport"); // NOI18N
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportMouseClicked(evt);
            }
        });
        jToolBar1.add(btnExport);

        btnPersist.setText("Save"); // NOI18N
        btnPersist.setFocusable(false);
        btnPersist.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPersist.setName("btnPersist"); // NOI18N
        btnPersist.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPersist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPersistMouseClicked(evt);
            }
        });
        jToolBar1.add(btnPersist);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblResults.setAutoCreateRowSorter(true);
        tblResults.setComponentPopupMenu(pmOptions);
        tblResults.setName("tblResults"); // NOI18N
        tblResults.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResults);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportMouseClicked
        String filename = UtilFunctions.saveFile(".xls");
        if (!filename.isEmpty()) {
            try {
                ResultExport.ExportCertToXLS(filename, ((CertModel) this.tblResults.getModel()).getData());
            } catch (IOException ex) {
                Logger.getLogger("reverseLookupDisplayResults.btnExportMouseClicked").log(Level.SEVERE, null, ex);
            }
        }
}//GEN-LAST:event_btnExportMouseClicked

    private void btnTrimUncheckedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrimUncheckedMouseClicked
        ReverseLookupModel model = (ReverseLookupModel) this.tblResults.getModel();
        for (int idx = model.getRowCount() - 1; idx >= 0; idx--) {
            if (!(Boolean) model.getValueAt(idx, 3)) {
                model.deleteRow(idx);
            }
        }
    }//GEN-LAST:event_btnTrimUncheckedMouseClicked

    public void saveData() {
        ReverseLookupModel model = (ReverseLookupModel) this.tblResults.getModel();
        DataStore.addReverseHosts(model.getData());
    }

    private void btnPersistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersistMouseClicked
        this.saveData();
    }//GEN-LAST:event_btnPersistMouseClicked

    private void tblResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultsMouseClicked

}//GEN-LAST:event_tblResultsMouseClicked

    private void miOpenBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenBrowserActionPerformed
        String siteAddress = "http://" + ((ReverseLookupModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 1).toString();
        UtilFunctions.launchBrowser(siteAddress);
    }//GEN-LAST:event_miOpenBrowserActionPerformed

    private void miWhoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWhoisActionPerformed
        String domain = ((ReverseLookupModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 2).toString();
        //utilFunctions.webWhois(domain);
        try {
            String name = domain.split("\\.", 2)[0];
            String tld = domain.split("\\.", 2)[1];
            DoWhois frmWhoisTool = new DoWhois(name, tld);
            frmWhoisTool.setVisible(true);
        } catch (Exception e) {
            DoWhois frmWhoisTool = new DoWhois();
            frmWhoisTool.setVisible(true);
        }
    }//GEN-LAST:event_miWhoisActionPerformed

    private void miSelectKnownDomainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectKnownDomainsActionPerformed
        ReverseLookupModel model = (ReverseLookupModel) this.tblResults.getModel();
        List<String> knownDomains = DataStore.getDomains(Globals.getCurrentFootprintId());
        List<String> initialDomains = DataStore.getInitialDataItems(DataStore.DOMAIN);
        for (int idx = 0; idx < model.getRowCount(); idx++) {
            String domain = model.getValueAt(idx, 2).toString();
            if (knownDomains.contains(domain) || initialDomains.contains(domain)) {
                model.setValueAt(true, idx, 3);
            } else {
                model.setValueAt(false, idx, 3);
            }
        }
    }//GEN-LAST:event_miSelectKnownDomainsActionPerformed

    private void miSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllActionPerformed
        ReverseLookupModel model = (ReverseLookupModel) this.tblResults.getModel();
        for (int idx = model.getRowCount() - 1; idx >= 0; idx--) {
            model.setValueAt(true, idx, 3);
        }
    }//GEN-LAST:event_miSelectAllActionPerformed

    private void miUnselectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnselectAllActionPerformed
        ReverseLookupModel model = (ReverseLookupModel) this.tblResults.getModel();
        for (int idx = model.getRowCount() - 1; idx >= 0; idx--) {
            model.setValueAt(false, idx, 3);
        }
    }//GEN-LAST:event_miUnselectAllActionPerformed

    private void toggleBasedOnDomain(String domain, boolean value) {
        ReverseLookupModel model = (ReverseLookupModel) this.tblResults.getModel();
        for (int idx = 0; idx < model.getRowCount(); idx++) {
            String cIp = model.getValueAt(idx, 2).toString();
            if (domain.compareTo(cIp) == 0) {
                model.setValueAt(value, idx, 3);
            }
        }
    }

    private void miSelectAllFromDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSelectAllFromDomainActionPerformed
        String domain = ((ReverseLookupModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 2).toString();
        this.toggleBasedOnDomain(domain, true);
    }//GEN-LAST:event_miSelectAllFromDomainActionPerformed

    private void miUnselectFromDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnselectFromDomainActionPerformed
        String domain = ((ReverseLookupModel) this.tblResults.getModel()).getValueAt(this.tblResults.getSelectedRow(), 2).toString();
        this.toggleBasedOnDomain(domain, false);
    }//GEN-LAST:event_miUnselectFromDomainActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnPersist;
    private javax.swing.JButton btnTrimUnchecked;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miOpenBrowser;
    private javax.swing.JMenuItem miSelectAll;
    private javax.swing.JMenuItem miSelectAllFromDomain;
    private javax.swing.JMenuItem miSelectKnownDomains;
    private javax.swing.JMenuItem miUnselectAll;
    private javax.swing.JMenuItem miUnselectFromDomain;
    private javax.swing.JMenuItem miWhois;
    private javax.swing.JPopupMenu pmOptions;
    public javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setModel(DefaultTableModel model) {
        this.tblResults.setModel((ReverseLookupModel) model);
    }

    @Override
    public DefaultTableModel getModel() {
        return (DefaultTableModel) tblResults.getModel();
    }
}