/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CalendarioDAO;
import funcoes.Telas;
import model.Calendario;

/**
 *
 * @author maikon.rosa
 */
public class JF_calendario extends javax.swing.JFrame {
 Calendario calendario = new Calendario();
 CalendarioDAO calendarioDao = new CalendarioDAO();
String nome = "sistema";   
    Telas telas = new Telas();
    /**
     * Creates new form JF_calendario
     */
    public JF_calendario() {
        initComponents();
        telas.Resolucao(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_animais = new javax.swing.JButton();
        btn_celeiro = new javax.swing.JButton();
        btn_usuario = new javax.swing.JButton();
        btn_calendario = new javax.swing.JButton();
        btn_log = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jdata = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jnome = new javax.swing.JTextField();
        btn_animais1 = new javax.swing.JButton();
        btn_rh = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_usuario1 = new javax.swing.JButton();
        Jcalendario = new javax.swing.JPanel();
        jcalendario_calendario = new com.toedter.calendar.JCalendar();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_anotacao_calendario = new javax.swing.JTextArea();
        btn_cadastrar_calendario = new javax.swing.JButton();
        btn_alterar_calendario = new javax.swing.JButton();
        btn_excluir_calendario = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        txt_calendario_id = new javax.swing.JTextField();
        sem_nota = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        atalho_animais = new javax.swing.JMenuItem();
        atalho_treinamento = new javax.swing.JMenuItem();
        atalho_consulta = new javax.swing.JMenuItem();
        atalho_finaceiro = new javax.swing.JMenuItem();
        atalho_rh = new javax.swing.JMenuItem();
        atalho_ferrajamento = new javax.swing.JMenuItem();
        atalho_log = new javax.swing.JMenuItem();
        atalho_pastagem = new javax.swing.JMenuItem();
        atalho_usuario = new javax.swing.JMenuItem();
        atalho_calendario = new javax.swing.JMenuItem();
        atalho_celeiro = new javax.swing.JMenu();
        atalho_feno = new javax.swing.JMenuItem();
        atalho_racao = new javax.swing.JMenuItem();
        atalho_serragem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), null));
        jPanel1.setMaximumSize(new java.awt.Dimension(3276, 3276));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));

        btn_animais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_animais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cavalo.png"))); // NOI18N
        btn_animais.setText("Animais       ");
        btn_animais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_animaisActionPerformed(evt);
            }
        });

        btn_celeiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_celeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/celeiro.png"))); // NOI18N
        btn_celeiro.setText("Haras");
        btn_celeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_celeiroActionPerformed(evt);
            }
        });

        btn_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario.png"))); // NOI18N
        btn_usuario.setText(" Usuários ");
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });

        btn_calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendario.png"))); // NOI18N
        btn_calendario.setText("Calendário");
        btn_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calendarioActionPerformed(evt);
            }
        });

        btn_log.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/log.png"))); // NOI18N
        btn_log.setText("Log          ");
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });

        btn_home.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jdata.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("Seja Bem-Vindo");

        btn_animais1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_animais1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario.png"))); // NOI18N
        btn_animais1.setText("Cliente        ");
        btn_animais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_animais1ActionPerformed(evt);
            }
        });

        btn_rh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_rh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manutencao.png"))); // NOI18N
        btn_rh.setText("R. H.         ");
        btn_rh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rhActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_usuario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/service.png"))); // NOI18N
        btn_usuario1.setText("Serviços");
        btn_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario1ActionPerformed(evt);
            }
        });

        jcalendario_calendario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcalendario_calendarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcalendario_calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcalendario_calendarioMouseClicked(evt);
            }
        });
        jcalendario_calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcalendario_calendarioPropertyChange(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Anotações");

        txt_anotacao_calendario.setColumns(20);
        txt_anotacao_calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_anotacao_calendario.setRows(5);
        jScrollPane10.setViewportView(txt_anotacao_calendario);

        btn_cadastrar_calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cadastrar_calendario.setText("Cadastrar");
        btn_cadastrar_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_calendarioActionPerformed(evt);
            }
        });

        btn_alterar_calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_alterar_calendario.setText("Alterar");
        btn_alterar_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterar_calendarioActionPerformed(evt);
            }
        });

        btn_excluir_calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_excluir_calendario.setText("Excluir");
        btn_excluir_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_calendarioActionPerformed(evt);
            }
        });

        jLabel94.setText("ID:");

        txt_calendario_id.setEditable(false);

        sem_nota.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout JcalendarioLayout = new javax.swing.GroupLayout(Jcalendario);
        Jcalendario.setLayout(JcalendarioLayout);
        JcalendarioLayout.setHorizontalGroup(
            JcalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JcalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcalendario_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JcalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(JcalendarioLayout.createSequentialGroup()
                        .addGroup(JcalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addGroup(JcalendarioLayout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_calendario_id, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sem_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JcalendarioLayout.createSequentialGroup()
                                .addComponent(btn_cadastrar_calendario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir_calendario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_alterar_calendario)))
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JcalendarioLayout.setVerticalGroup(
            JcalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JcalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcalendario_calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JcalendarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(JcalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(txt_calendario_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sem_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JcalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar_calendario)
                    .addComponent(btn_excluir_calendario)
                    .addComponent(btn_alterar_calendario))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel84)
                        .addGap(62, 62, 62))
                    .addComponent(btn_animais1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_celeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_rh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_animais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(btn_animais)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_animais1)
                                .addGap(5, 5, 5)
                                .addComponent(btn_calendario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_celeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_rh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_log)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_usuario1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Atalho ");

        atalho_animais.setText("Animais ");
        atalho_animais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_animaisbtn_animaisActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_animais);

        atalho_treinamento.setText("Treinamento ");
        atalho_treinamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_treinamentobtn_treinamentoActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_treinamento);

        atalho_consulta.setText("Consulta ");
        atalho_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_consultabtn_veterinarioActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_consulta);

        atalho_finaceiro.setText("Financeiro ");
        atalho_finaceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_finaceirobtn_financeiroActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_finaceiro);

        atalho_rh.setText("RH");
        atalho_rh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_rhbtn_rhActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_rh);

        atalho_ferrajamento.setText("Ferrajamento");
        atalho_ferrajamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_ferrajamentobtn_ferrajamentoActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_ferrajamento);

        atalho_log.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        atalho_log.setText("Historioco de ação ");
        atalho_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_logbtn_logActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_log);

        atalho_pastagem.setText("Pastagem ");
        atalho_pastagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_pastagembtn_pastagemActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_pastagem);

        atalho_usuario.setText("Cadastro de usuário");
        atalho_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_usuariobtn_usuarioActionPerformed(evt);
            }
        });
        jMenu2.add(atalho_usuario);

        atalho_calendario.setText("Calendário");
        jMenu2.add(atalho_calendario);

        atalho_celeiro.setText("Celeiro ");
        atalho_celeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_celeirobtn_celeiroActionPerformed(evt);
            }
        });

        atalho_feno.setText("Feno");
        atalho_feno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalho_fenoActionPerformed(evt);
            }
        });
        atalho_celeiro.add(atalho_feno);

        atalho_racao.setText("Ração ");
        atalho_celeiro.add(atalho_racao);

        atalho_serragem.setText("Serragem ");
        atalho_celeiro.add(atalho_serragem);

        jMenu2.add(atalho_celeiro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_animaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_animaisActionPerformed
       telas.alterar(this, 5);
    }//GEN-LAST:event_btn_animaisActionPerformed

    private void btn_celeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_celeiroActionPerformed
      telas.alterar(this, 7);
    }//GEN-LAST:event_btn_celeiroActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
    telas.alterar(this, 12);
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarioActionPerformed
       telas.alterar(this, 4);
    }//GEN-LAST:event_btn_calendarioActionPerformed

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
 telas.alterar(this, 13);
    }//GEN-LAST:event_btn_logActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
 telas.alterar(this,1);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_animais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_animais1ActionPerformed
         telas.alterar(this, 2);
    }//GEN-LAST:event_btn_animais1ActionPerformed

    private void btn_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario1ActionPerformed
        telas.alterar(this, 2);        
    }//GEN-LAST:event_btn_usuario1ActionPerformed

    private void atalho_animaisbtn_animaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_animaisbtn_animaisActionPerformed
        
    }//GEN-LAST:event_atalho_animaisbtn_animaisActionPerformed

    private void atalho_treinamentobtn_treinamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_treinamentobtn_treinamentoActionPerformed

    }//GEN-LAST:event_atalho_treinamentobtn_treinamentoActionPerformed

    private void atalho_consultabtn_veterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_consultabtn_veterinarioActionPerformed
        
    }//GEN-LAST:event_atalho_consultabtn_veterinarioActionPerformed

    private void atalho_finaceirobtn_financeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_finaceirobtn_financeiroActionPerformed
        
    }//GEN-LAST:event_atalho_finaceirobtn_financeiroActionPerformed

    private void atalho_rhbtn_rhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_rhbtn_rhActionPerformed
     
    }//GEN-LAST:event_atalho_rhbtn_rhActionPerformed

    private void atalho_ferrajamentobtn_ferrajamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_ferrajamentobtn_ferrajamentoActionPerformed
       
    }//GEN-LAST:event_atalho_ferrajamentobtn_ferrajamentoActionPerformed

    private void atalho_logbtn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_logbtn_logActionPerformed
        
    }//GEN-LAST:event_atalho_logbtn_logActionPerformed

    private void atalho_pastagembtn_pastagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_pastagembtn_pastagemActionPerformed
      
    }//GEN-LAST:event_atalho_pastagembtn_pastagemActionPerformed

    private void atalho_usuariobtn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_usuariobtn_usuarioActionPerformed
      
    }//GEN-LAST:event_atalho_usuariobtn_usuarioActionPerformed

    private void atalho_fenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_fenoActionPerformed
      

        // TODO add your handling code here:
    }//GEN-LAST:event_atalho_fenoActionPerformed

    private void atalho_celeirobtn_celeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalho_celeirobtn_celeiroActionPerformed
        
    }//GEN-LAST:event_atalho_celeirobtn_celeiroActionPerformed

    private void jcalendario_calendarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcalendario_calendarioAncestorAdded

    }//GEN-LAST:event_jcalendario_calendarioAncestorAdded

    private void jcalendario_calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcalendario_calendarioMouseClicked

    }//GEN-LAST:event_jcalendario_calendarioMouseClicked

    private void jcalendario_calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcalendario_calendarioPropertyChange
        java.sql.Date sqldate_calendario = new java.sql.Date(jcalendario_calendario.getDate().getTime());
        calendario.setCalendario_data(sqldate_calendario);

        calendarioDao.consultarCalendarioDATA(sqldate_calendario, txt_calendario_id, txt_anotacao_calendario, btn_excluir_calendario, btn_alterar_calendario, btn_cadastrar_calendario, this);
    }//GEN-LAST:event_jcalendario_calendarioPropertyChange

    private void btn_cadastrar_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_calendarioActionPerformed

        java.sql.Date sqldate_calendario = new java.sql.Date(jcalendario_calendario.getDate().getTime());
        calendario.setCalendario_data(sqldate_calendario);
        calendario.setCalendario_desc(txt_anotacao_calendario.getText());
        if (!"".equals(txt_anotacao_calendario.getText())) {
            calendarioDao.salvarCalendario(calendario, nome, this);
            sem_nota.setText("");
        } else {
            sem_nota.setText("Adicione uma nota");
        }
    }//GEN-LAST:event_btn_cadastrar_calendarioActionPerformed

    private void btn_alterar_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterar_calendarioActionPerformed

        String how = txt_calendario_id.getText();
        calendario.setCalendario_id(Integer.valueOf(txt_calendario_id.getText()));
        java.sql.Date sqldate_calendario = new java.sql.Date(jcalendario_calendario.getDate().getTime());
        calendario.setCalendario_data(sqldate_calendario);
        calendario.setCalendario_desc(txt_anotacao_calendario.getText());
        if (!"".equals(txt_anotacao_calendario.getText())) {
            calendarioDao.alterarCalendario(calendario, nome, how, this);
        } else {
            sem_nota.setText("Se pretende deixar o campo vazio, sugiro que apague a nota");
        }
    }//GEN-LAST:event_btn_alterar_calendarioActionPerformed

    private void btn_excluir_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_calendarioActionPerformed

        String how = txt_calendario_id.getText();
        calendario.setCalendario_id(Integer.valueOf(txt_calendario_id.getText()));

        txt_calendario_id.setText("");
        txt_anotacao_calendario.setText("");
        calendarioDao.apagarCalendario(calendario, nome, how, this);
        sem_nota.setText("");
    }//GEN-LAST:event_btn_excluir_calendarioActionPerformed

    private void btn_rhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rhActionPerformed
       telas.alterar(this, 11);
        
    }//GEN-LAST:event_btn_rhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_calendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jcalendario;
    private javax.swing.JMenuItem atalho_animais;
    private javax.swing.JMenuItem atalho_calendario;
    private javax.swing.JMenu atalho_celeiro;
    private javax.swing.JMenuItem atalho_consulta;
    private javax.swing.JMenuItem atalho_feno;
    private javax.swing.JMenuItem atalho_ferrajamento;
    private javax.swing.JMenuItem atalho_finaceiro;
    private javax.swing.JMenuItem atalho_log;
    private javax.swing.JMenuItem atalho_pastagem;
    private javax.swing.JMenuItem atalho_racao;
    private javax.swing.JMenuItem atalho_rh;
    private javax.swing.JMenuItem atalho_serragem;
    private javax.swing.JMenuItem atalho_treinamento;
    private javax.swing.JMenuItem atalho_usuario;
    private javax.swing.JButton btn_alterar_calendario;
    private javax.swing.JButton btn_animais;
    private javax.swing.JButton btn_animais1;
    private javax.swing.JButton btn_cadastrar_calendario;
    private javax.swing.JButton btn_calendario;
    private javax.swing.JButton btn_celeiro;
    private javax.swing.JButton btn_excluir_calendario;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_log;
    private javax.swing.JButton btn_rh;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JButton btn_usuario1;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator22;
    private com.toedter.calendar.JCalendar jcalendario_calendario;
    private javax.swing.JLabel jdata;
    private javax.swing.JTextField jnome;
    private javax.swing.JLabel sem_nota;
    private javax.swing.JTextArea txt_anotacao_calendario;
    private javax.swing.JTextField txt_calendario_id;
    // End of variables declaration//GEN-END:variables
}
