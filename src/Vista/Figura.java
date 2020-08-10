package Vista;

import Modelo.factory;
import Modelo.setfigura;
import Interface.Interfaz;

public class Figura extends javax.swing.JFrame {

    public Figura() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combobox = new javax.swing.JComboBox<>();
        calcular = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        altura = new javax.swing.JLabel();
        lado = new javax.swing.JLabel();
        radio = new javax.swing.JLabel();
        apotema = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtLado = new javax.swing.JTextField();
        txtRadio = new javax.swing.JTextField();
        txtApotema = new javax.swing.JTextField();
        base = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        combobox.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una figura", "circulo", "cuadrado", "rectangulo", "triangulo", "octagono" }));
        combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxSeleccion(evt);
            }
        });

        calcular.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        altura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        altura.setText("Altura");

        lado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lado.setText("Lado");

        radio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radio.setText("Radio");

        apotema.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        apotema.setText("Apotema");

        base.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        base.setText("Base");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(base, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apotema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApotema, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRadio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAltura)
                    .addComponent(txtBase, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(base)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lado)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apotema)
                    .addComponent(txtApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(calcular)
                        .addGap(103, 103, 103)
                        .addComponent(limpiar)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(limpiar))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxSeleccion(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxSeleccion

        if ("circulo".equals(combobox.getSelectedItem().toString())) {

            this.txtApotema.setVisible(false);
            this.txtAltura.setVisible(false);
            this.txtBase.setVisible(false);
            this.txtLado.setVisible(false);
            this.txtRadio.setVisible(true);

            this.altura.setVisible(false);
            this.lado.setVisible(false);
            this.base.setVisible(false);
            this.apotema.setVisible(false);
            this.radio.setVisible(true);

        }

        if ("cuadrado".equals(combobox.getSelectedItem().toString())) {

            this.txtApotema.setVisible(false);
            this.txtAltura.setVisible(false);
            this.txtBase.setVisible(false);
            this.txtLado.setVisible(true);
            this.txtRadio.setVisible(false);

            this.altura.setVisible(false);
            this.lado.setVisible(true);
            this.base.setVisible(false);
            this.apotema.setVisible(false);
            this.radio.setVisible(false);

        }
        if ("triangulo".equals(combobox.getSelectedItem().toString())) {

            this.txtApotema.setVisible(false);
            this.txtAltura.setVisible(true);
            this.txtBase.setVisible(true);
            this.txtLado.setVisible(false);
            this.txtRadio.setVisible(false);

            this.altura.setVisible(true);
            this.lado.setVisible(false);
            this.base.setVisible(true);
            this.apotema.setVisible(false);
            this.radio.setVisible(false);

        }

        if ("rectangulo".equals(combobox.getSelectedItem().toString())) {

            this.txtApotema.setVisible(false);
            this.txtAltura.setVisible(true);
            this.txtBase.setVisible(false);
            this.txtLado.setVisible(true);
            this.txtRadio.setVisible(false);

            this.altura.setVisible(true);
            this.lado.setVisible(true);
            this.base.setVisible(false);
            this.apotema.setVisible(false);
            this.radio.setVisible(false);

        }

        if ("octagono".equals(combobox.getSelectedItem().toString())) {

            this.txtApotema.setVisible(true);
            this.txtAltura.setVisible(false);
            this.txtBase.setVisible(false);
            this.txtLado.setVisible(true);
            this.txtRadio.setVisible(false);

            this.altura.setVisible(false);
            this.lado.setVisible(true);
            this.base.setVisible(false);
            this.apotema.setVisible(true);
            this.radio.setVisible(false);

        }

        if ("Seleccionar".equals(combobox.getSelectedItem().toString())) {
            this.txt.setText("Selecciona una figura");
        }
    }//GEN-LAST:event_comboboxSeleccion

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed

        if ("circulo".equals(combobox.getSelectedItem().toString())) {

            setfigura circulo = new setfigura();
            Interfaz cir = factory.getinsfig(combobox.getSelectedItem().toString());
            circulo.setRadio(Double.parseDouble(this.txtRadio.getText()));
            String perimet = String.valueOf(cir.perimetro(circulo));
            String area = String.valueOf(cir.area(circulo));

            this.txt.setText(cir.descripcion() + " \n con area: " + area + " y perimetro : " + perimet);

        }

        if ("cuadrado".equals(combobox.getSelectedItem().toString())) {

            setfigura cuadrado = new setfigura();
            Interfaz cua = factory.getinsfig(combobox.getSelectedItem().toString());
            cuadrado.setLado(Double.parseDouble(this.txtLado.getText()));
            String perimet = String.valueOf(cua.perimetro(cuadrado));
            String area = String.valueOf(cua.area(cuadrado));

            this.txt.setText(cua.descripcion() + "con area: " + area + " y perimetro : " + perimet);

        }
        if ("triangulo".equals(combobox.getSelectedItem().toString())) {

            setfigura triangulo = new setfigura();
            Interfaz Tri = factory.getinsfig(combobox.getSelectedItem().toString());
            triangulo.setBase(Double.parseDouble(this.txtBase.getText()));
            triangulo.setAltura(Double.parseDouble(this.txtAltura.getText()));
            String perimet = String.valueOf(Tri.perimetro(triangulo));
            String area = String.valueOf(Tri.area(triangulo));

            this.txt.setText(Tri.descripcion() + " con area: " + area + " y perimetro : " + perimet);

        }

        if ("rectangulo".equals(combobox.getSelectedItem().toString())) {

            setfigura rectangulo = new setfigura();
            Interfaz rec = factory.getinsfig(combobox.getSelectedItem().toString());
            rectangulo.setLado(Double.parseDouble(this.txtLado.getText()));
            rectangulo.setAltura(Double.parseDouble(this.txtAltura.getText()));
            String perimet = String.valueOf(rec.perimetro(rectangulo));
            String area = String.valueOf(rec.area(rectangulo));

            this.txt.setText(rec.descripcion() + " con area: " + area + " y perimetro : " + perimet);

        }

        if ("octagono".equals(combobox.getSelectedItem().toString())) {

            setfigura octagono = new setfigura();
            Interfaz oct = factory.getinsfig(combobox.getSelectedItem().toString());
            octagono.setLado(Double.parseDouble(this.txtLado.getText()));
            octagono.setApotema(Double.parseDouble(this.txtApotema.getText()));
            String perimet = String.valueOf(oct.perimetro(octagono));
            String area = String.valueOf(oct.area(octagono));

            this.txt.setText(oct.descripcion() + " \n con area: " + area + " y perimetro : " + perimet);

        }

        if ("Seleccionar".equals(combobox.getSelectedItem().toString())) {
            this.txt.setText("Selecciona una figura");
        }

    }//GEN-LAST:event_calcularActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Figura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel altura;
    public javax.swing.JLabel apotema;
    public javax.swing.JLabel base;
    public javax.swing.JButton calcular;
    public javax.swing.JComboBox<String> combobox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lado;
    public javax.swing.JButton limpiar;
    public javax.swing.JLabel radio;
    public javax.swing.JTextArea txt;
    public javax.swing.JTextField txtAltura;
    public javax.swing.JTextField txtApotema;
    public javax.swing.JTextField txtBase;
    public javax.swing.JTextField txtLado;
    public javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
