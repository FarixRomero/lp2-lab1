namespace LP2Clinica
{
    partial class frmRegistro
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.pbUserRegistro = new System.Windows.Forms.PictureBox();
            this.lblDNI = new System.Windows.Forms.Label();
            this.txtDNI = new System.Windows.Forms.TextBox();
            this.lblNombre = new System.Windows.Forms.Label();
            this.lblApellido = new System.Windows.Forms.Label();
            this.txtNombre = new System.Windows.Forms.TextBox();
            this.txtApellido = new System.Windows.Forms.TextBox();
            this.lblFecha = new System.Windows.Forms.Label();
            this.dtpFecha = new System.Windows.Forms.DateTimePicker();
            this.lblTipo = new System.Windows.Forms.Label();
            this.rbPaciente = new System.Windows.Forms.RadioButton();
            this.rbMedico = new System.Windows.Forms.RadioButton();
            this.rbAdministrador = new System.Windows.Forms.RadioButton();
            this.pRegistro = new System.Windows.Forms.Panel();
            this.btnSiguiente = new System.Windows.Forms.Button();
            this.bnCancelar = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pbUserRegistro)).BeginInit();
            this.pRegistro.SuspendLayout();
            this.SuspendLayout();
            // 
            // pbUserRegistro
            // 
            this.pbUserRegistro.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(4)))), ((int)(((byte)(37)))), ((int)(((byte)(91)))));
            this.pbUserRegistro.Image = global::LP2Clinica.Properties.Resources.user3;
            this.pbUserRegistro.Location = new System.Drawing.Point(295, 49);
            this.pbUserRegistro.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pbUserRegistro.Name = "pbUserRegistro";
            this.pbUserRegistro.Size = new System.Drawing.Size(237, 213);
            this.pbUserRegistro.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbUserRegistro.TabIndex = 0;
            this.pbUserRegistro.TabStop = false;
            // 
            // lblDNI
            // 
            this.lblDNI.AutoSize = true;
            this.lblDNI.BackColor = System.Drawing.Color.Transparent;
            this.lblDNI.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDNI.ForeColor = System.Drawing.Color.White;
            this.lblDNI.Location = new System.Drawing.Point(25, 27);
            this.lblDNI.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblDNI.Name = "lblDNI";
            this.lblDNI.Size = new System.Drawing.Size(56, 28);
            this.lblDNI.TabIndex = 21;
            this.lblDNI.Text = "DNI:";
            // 
            // txtDNI
            // 
            this.txtDNI.BackColor = System.Drawing.Color.LightGray;
            this.txtDNI.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtDNI.Location = new System.Drawing.Point(187, 27);
            this.txtDNI.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtDNI.Name = "txtDNI";
            this.txtDNI.Size = new System.Drawing.Size(251, 22);
            this.txtDNI.TabIndex = 22;
            // 
            // lblNombre
            // 
            this.lblNombre.AutoSize = true;
            this.lblNombre.BackColor = System.Drawing.Color.Transparent;
            this.lblNombre.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNombre.ForeColor = System.Drawing.Color.White;
            this.lblNombre.Location = new System.Drawing.Point(25, 76);
            this.lblNombre.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblNombre.Name = "lblNombre";
            this.lblNombre.Size = new System.Drawing.Size(100, 28);
            this.lblNombre.TabIndex = 23;
            this.lblNombre.Text = "Nombre:";
            // 
            // lblApellido
            // 
            this.lblApellido.AutoSize = true;
            this.lblApellido.BackColor = System.Drawing.Color.Transparent;
            this.lblApellido.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblApellido.ForeColor = System.Drawing.Color.White;
            this.lblApellido.Location = new System.Drawing.Point(25, 130);
            this.lblApellido.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblApellido.Name = "lblApellido";
            this.lblApellido.Size = new System.Drawing.Size(104, 28);
            this.lblApellido.TabIndex = 24;
            this.lblApellido.Text = "Apellido:";
            // 
            // txtNombre
            // 
            this.txtNombre.BackColor = System.Drawing.Color.LightGray;
            this.txtNombre.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtNombre.Location = new System.Drawing.Point(187, 76);
            this.txtNombre.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtNombre.Name = "txtNombre";
            this.txtNombre.Size = new System.Drawing.Size(334, 22);
            this.txtNombre.TabIndex = 25;
            // 
            // txtApellido
            // 
            this.txtApellido.BackColor = System.Drawing.Color.LightGray;
            this.txtApellido.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtApellido.Location = new System.Drawing.Point(187, 130);
            this.txtApellido.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtApellido.Name = "txtApellido";
            this.txtApellido.Size = new System.Drawing.Size(334, 22);
            this.txtApellido.TabIndex = 26;
            // 
            // lblFecha
            // 
            this.lblFecha.AutoSize = true;
            this.lblFecha.BackColor = System.Drawing.Color.Transparent;
            this.lblFecha.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblFecha.ForeColor = System.Drawing.Color.White;
            this.lblFecha.Location = new System.Drawing.Point(25, 182);
            this.lblFecha.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblFecha.Name = "lblFecha";
            this.lblFecha.Size = new System.Drawing.Size(199, 28);
            this.lblFecha.TabIndex = 27;
            this.lblFecha.Text = "Fecha Nacimiento:";
            // 
            // dtpFecha
            // 
            this.dtpFecha.Font = new System.Drawing.Font("Tw Cen MT", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dtpFecha.Location = new System.Drawing.Point(255, 182);
            this.dtpFecha.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.dtpFecha.Name = "dtpFecha";
            this.dtpFecha.Size = new System.Drawing.Size(265, 22);
            this.dtpFecha.TabIndex = 28;
            // 
            // lblTipo
            // 
            this.lblTipo.AutoSize = true;
            this.lblTipo.BackColor = System.Drawing.Color.Transparent;
            this.lblTipo.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTipo.ForeColor = System.Drawing.Color.White;
            this.lblTipo.Location = new System.Drawing.Point(25, 226);
            this.lblTipo.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblTipo.Name = "lblTipo";
            this.lblTipo.Size = new System.Drawing.Size(177, 28);
            this.lblTipo.TabIndex = 29;
            this.lblTipo.Text = "Tipo de Usuario:";
            // 
            // rbPaciente
            // 
            this.rbPaciente.AutoSize = true;
            this.rbPaciente.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rbPaciente.ForeColor = System.Drawing.Color.White;
            this.rbPaciente.Location = new System.Drawing.Point(255, 222);
            this.rbPaciente.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.rbPaciente.Name = "rbPaciente";
            this.rbPaciente.Size = new System.Drawing.Size(114, 32);
            this.rbPaciente.TabIndex = 30;
            this.rbPaciente.TabStop = true;
            this.rbPaciente.Text = "Paciente";
            this.rbPaciente.UseVisualStyleBackColor = true;
            // 
            // rbMedico
            // 
            this.rbMedico.AutoSize = true;
            this.rbMedico.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rbMedico.ForeColor = System.Drawing.Color.White;
            this.rbMedico.Location = new System.Drawing.Point(385, 220);
            this.rbMedico.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.rbMedico.Name = "rbMedico";
            this.rbMedico.Size = new System.Drawing.Size(103, 32);
            this.rbMedico.TabIndex = 31;
            this.rbMedico.TabStop = true;
            this.rbMedico.Text = "Medico";
            this.rbMedico.UseVisualStyleBackColor = true;
            // 
            // rbAdministrador
            // 
            this.rbAdministrador.AutoSize = true;
            this.rbAdministrador.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.rbAdministrador.ForeColor = System.Drawing.Color.White;
            this.rbAdministrador.Location = new System.Drawing.Point(505, 220);
            this.rbAdministrador.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.rbAdministrador.Name = "rbAdministrador";
            this.rbAdministrador.Size = new System.Drawing.Size(167, 32);
            this.rbAdministrador.TabIndex = 32;
            this.rbAdministrador.TabStop = true;
            this.rbAdministrador.Text = "Administrador";
            this.rbAdministrador.UseVisualStyleBackColor = true;
            // 
            // pRegistro
            // 
            this.pRegistro.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(62)))), ((int)(((byte)(114)))));
            this.pRegistro.Controls.Add(this.rbAdministrador);
            this.pRegistro.Controls.Add(this.rbMedico);
            this.pRegistro.Controls.Add(this.rbPaciente);
            this.pRegistro.Controls.Add(this.lblTipo);
            this.pRegistro.Controls.Add(this.dtpFecha);
            this.pRegistro.Controls.Add(this.lblFecha);
            this.pRegistro.Controls.Add(this.txtApellido);
            this.pRegistro.Controls.Add(this.txtNombre);
            this.pRegistro.Controls.Add(this.lblApellido);
            this.pRegistro.Controls.Add(this.lblNombre);
            this.pRegistro.Controls.Add(this.txtDNI);
            this.pRegistro.Controls.Add(this.lblDNI);
            this.pRegistro.Location = new System.Drawing.Point(71, 318);
            this.pRegistro.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pRegistro.Name = "pRegistro";
            this.pRegistro.Size = new System.Drawing.Size(689, 294);
            this.pRegistro.TabIndex = 16;
            // 
            // btnSiguiente
            // 
            this.btnSiguiente.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnSiguiente.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnSiguiente.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnSiguiente.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSiguiente.ForeColor = System.Drawing.Color.White;
            this.btnSiguiente.Location = new System.Drawing.Point(579, 658);
            this.btnSiguiente.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnSiguiente.Name = "btnSiguiente";
            this.btnSiguiente.Size = new System.Drawing.Size(211, 41);
            this.btnSiguiente.TabIndex = 24;
            this.btnSiguiente.Text = "Siguiente";
            this.btnSiguiente.UseVisualStyleBackColor = false;
            this.btnSiguiente.Click += new System.EventHandler(this.btnSiguiente_Click);
            // 
            // bnCancelar
            // 
            this.bnCancelar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.bnCancelar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.bnCancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.bnCancelar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.bnCancelar.ForeColor = System.Drawing.Color.White;
            this.bnCancelar.Location = new System.Drawing.Point(52, 658);
            this.bnCancelar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.bnCancelar.Name = "bnCancelar";
            this.bnCancelar.Size = new System.Drawing.Size(211, 41);
            this.bnCancelar.TabIndex = 25;
            this.bnCancelar.Text = "Cancelar";
            this.bnCancelar.UseVisualStyleBackColor = false;
            this.bnCancelar.Click += new System.EventHandler(this.bnCancelar_Click);
            // 
            // frmRegistro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Cyan;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_4;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(821, 714);
            this.Controls.Add(this.bnCancelar);
            this.Controls.Add(this.btnSiguiente);
            this.Controls.Add(this.pRegistro);
            this.Controls.Add(this.pbUserRegistro);
            this.DoubleBuffered = true;
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "frmRegistro";
            this.Text = "Registrar Cuenta Usuario";
            ((System.ComponentModel.ISupportInitialize)(this.pbUserRegistro)).EndInit();
            this.pRegistro.ResumeLayout(false);
            this.pRegistro.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pbUserRegistro;
        private System.Windows.Forms.Label lblDNI;
        private System.Windows.Forms.TextBox txtDNI;
        private System.Windows.Forms.Label lblNombre;
        private System.Windows.Forms.Label lblApellido;
        private System.Windows.Forms.TextBox txtNombre;
        private System.Windows.Forms.TextBox txtApellido;
        private System.Windows.Forms.Label lblFecha;
        private System.Windows.Forms.DateTimePicker dtpFecha;
        private System.Windows.Forms.Label lblTipo;
        private System.Windows.Forms.RadioButton rbPaciente;
        private System.Windows.Forms.RadioButton rbMedico;
        private System.Windows.Forms.RadioButton rbAdministrador;
        private System.Windows.Forms.Panel pRegistro;
        private System.Windows.Forms.Button btnSiguiente;
        private System.Windows.Forms.Button bnCancelar;
    }
}