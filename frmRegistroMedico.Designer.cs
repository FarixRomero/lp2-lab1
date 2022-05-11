namespace LP2Clinica
{
    partial class frmRegistroMedico
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
            this.btnConfirmar = new System.Windows.Forms.Button();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.pRegistro = new System.Windows.Forms.Panel();
            this.txtIDAdmin = new System.Windows.Forms.TextBox();
            this.lblAdministrador = new System.Windows.Forms.Label();
            this.cbEspecialidad = new System.Windows.Forms.ComboBox();
            this.pbPaciente = new System.Windows.Forms.PictureBox();
            this.lblEspecialidad = new System.Windows.Forms.Label();
            this.txtContraseña = new System.Windows.Forms.TextBox();
            this.txtUsername = new System.Windows.Forms.TextBox();
            this.lblContraseña = new System.Windows.Forms.Label();
            this.lblUsername = new System.Windows.Forms.Label();
            this.txtEmail = new System.Windows.Forms.TextBox();
            this.lblEmail = new System.Windows.Forms.Label();
            this.pbHome = new System.Windows.Forms.PictureBox();
            this.pbUserRegistro = new System.Windows.Forms.PictureBox();
            this.pRegistro.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbPaciente)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbUserRegistro)).BeginInit();
            this.SuspendLayout();
            // 
            // btnConfirmar
            // 
            this.btnConfirmar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnConfirmar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnConfirmar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnConfirmar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConfirmar.ForeColor = System.Drawing.Color.White;
            this.btnConfirmar.Location = new System.Drawing.Point(588, 657);
            this.btnConfirmar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnConfirmar.Name = "btnConfirmar";
            this.btnConfirmar.Size = new System.Drawing.Size(211, 41);
            this.btnConfirmar.TabIndex = 38;
            this.btnConfirmar.Text = "Confirmar";
            this.btnConfirmar.UseVisualStyleBackColor = false;
            this.btnConfirmar.Click += new System.EventHandler(this.btnConfirmar_Click);
            // 
            // btnCancelar
            // 
            this.btnCancelar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnCancelar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnCancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCancelar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCancelar.ForeColor = System.Drawing.Color.White;
            this.btnCancelar.Location = new System.Drawing.Point(61, 657);
            this.btnCancelar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(211, 41);
            this.btnCancelar.TabIndex = 37;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = false;
            this.btnCancelar.Click += new System.EventHandler(this.btnCancelar_Click);
            // 
            // pRegistro
            // 
            this.pRegistro.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(62)))), ((int)(((byte)(114)))));
            this.pRegistro.Controls.Add(this.txtIDAdmin);
            this.pRegistro.Controls.Add(this.lblAdministrador);
            this.pRegistro.Controls.Add(this.cbEspecialidad);
            this.pRegistro.Controls.Add(this.pbPaciente);
            this.pRegistro.Controls.Add(this.lblEspecialidad);
            this.pRegistro.Controls.Add(this.txtContraseña);
            this.pRegistro.Controls.Add(this.txtUsername);
            this.pRegistro.Controls.Add(this.lblContraseña);
            this.pRegistro.Controls.Add(this.lblUsername);
            this.pRegistro.Controls.Add(this.txtEmail);
            this.pRegistro.Controls.Add(this.lblEmail);
            this.pRegistro.Location = new System.Drawing.Point(75, 338);
            this.pRegistro.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pRegistro.Name = "pRegistro";
            this.pRegistro.Size = new System.Drawing.Size(689, 294);
            this.pRegistro.TabIndex = 36;
            // 
            // txtIDAdmin
            // 
            this.txtIDAdmin.BackColor = System.Drawing.Color.LightGray;
            this.txtIDAdmin.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtIDAdmin.Location = new System.Drawing.Point(537, 246);
            this.txtIDAdmin.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtIDAdmin.Name = "txtIDAdmin";
            this.txtIDAdmin.Size = new System.Drawing.Size(119, 22);
            this.txtIDAdmin.TabIndex = 38;
            // 
            // lblAdministrador
            // 
            this.lblAdministrador.AutoSize = true;
            this.lblAdministrador.BackColor = System.Drawing.Color.Transparent;
            this.lblAdministrador.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAdministrador.ForeColor = System.Drawing.Color.White;
            this.lblAdministrador.Location = new System.Drawing.Point(205, 241);
            this.lblAdministrador.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblAdministrador.Name = "lblAdministrador";
            this.lblAdministrador.Size = new System.Drawing.Size(309, 28);
            this.lblAdministrador.TabIndex = 37;
            this.lblAdministrador.Text = "ID del Administrador a cargo:";
            // 
            // cbEspecialidad
            // 
            this.cbEspecialidad.FormattingEnabled = true;
            this.cbEspecialidad.Location = new System.Drawing.Point(388, 198);
            this.cbEspecialidad.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.cbEspecialidad.Name = "cbEspecialidad";
            this.cbEspecialidad.Size = new System.Drawing.Size(268, 24);
            this.cbEspecialidad.TabIndex = 36;
            // 
            // pbPaciente
            // 
            this.pbPaciente.BackColor = System.Drawing.Color.Transparent;
            this.pbPaciente.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.pbPaciente.Image = global::LP2Clinica.Properties.Resources._3997b837ba0548ec1a5430ee31fb43aa_removebg_preview;
            this.pbPaciente.Location = new System.Drawing.Point(11, 43);
            this.pbPaciente.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pbPaciente.Name = "pbPaciente";
            this.pbPaciente.Size = new System.Drawing.Size(187, 203);
            this.pbPaciente.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbPaciente.TabIndex = 35;
            this.pbPaciente.TabStop = false;
            // 
            // lblEspecialidad
            // 
            this.lblEspecialidad.AutoSize = true;
            this.lblEspecialidad.BackColor = System.Drawing.Color.Transparent;
            this.lblEspecialidad.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEspecialidad.ForeColor = System.Drawing.Color.White;
            this.lblEspecialidad.Location = new System.Drawing.Point(205, 194);
            this.lblEspecialidad.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblEspecialidad.Name = "lblEspecialidad";
            this.lblEspecialidad.Size = new System.Drawing.Size(145, 28);
            this.lblEspecialidad.TabIndex = 33;
            this.lblEspecialidad.Text = "Especialidad:";
            // 
            // txtContraseña
            // 
            this.txtContraseña.BackColor = System.Drawing.Color.LightGray;
            this.txtContraseña.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtContraseña.Location = new System.Drawing.Point(388, 146);
            this.txtContraseña.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtContraseña.Name = "txtContraseña";
            this.txtContraseña.Size = new System.Drawing.Size(269, 22);
            this.txtContraseña.TabIndex = 26;
            // 
            // txtUsername
            // 
            this.txtUsername.BackColor = System.Drawing.Color.LightGray;
            this.txtUsername.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtUsername.Location = new System.Drawing.Point(388, 92);
            this.txtUsername.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtUsername.Name = "txtUsername";
            this.txtUsername.Size = new System.Drawing.Size(269, 22);
            this.txtUsername.TabIndex = 25;
            // 
            // lblContraseña
            // 
            this.lblContraseña.AutoSize = true;
            this.lblContraseña.BackColor = System.Drawing.Color.Transparent;
            this.lblContraseña.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblContraseña.ForeColor = System.Drawing.Color.White;
            this.lblContraseña.Location = new System.Drawing.Point(205, 146);
            this.lblContraseña.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblContraseña.Name = "lblContraseña";
            this.lblContraseña.Size = new System.Drawing.Size(133, 28);
            this.lblContraseña.TabIndex = 24;
            this.lblContraseña.Text = "Contraseña:";
            // 
            // lblUsername
            // 
            this.lblUsername.AutoSize = true;
            this.lblUsername.BackColor = System.Drawing.Color.Transparent;
            this.lblUsername.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUsername.ForeColor = System.Drawing.Color.White;
            this.lblUsername.Location = new System.Drawing.Point(205, 92);
            this.lblUsername.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblUsername.Name = "lblUsername";
            this.lblUsername.Size = new System.Drawing.Size(120, 28);
            this.lblUsername.TabIndex = 23;
            this.lblUsername.Text = "Username:";
            // 
            // txtEmail
            // 
            this.txtEmail.BackColor = System.Drawing.Color.LightGray;
            this.txtEmail.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtEmail.Location = new System.Drawing.Point(388, 43);
            this.txtEmail.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(269, 22);
            this.txtEmail.TabIndex = 22;
            // 
            // lblEmail
            // 
            this.lblEmail.AutoSize = true;
            this.lblEmail.BackColor = System.Drawing.Color.Transparent;
            this.lblEmail.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEmail.ForeColor = System.Drawing.Color.White;
            this.lblEmail.Location = new System.Drawing.Point(205, 43);
            this.lblEmail.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblEmail.Name = "lblEmail";
            this.lblEmail.Size = new System.Drawing.Size(74, 28);
            this.lblEmail.TabIndex = 21;
            this.lblEmail.Text = "Email:";
            // 
            // pbHome
            // 
            this.pbHome.BackColor = System.Drawing.Color.Transparent;
            this.pbHome.Image = global::LP2Clinica.Properties.Resources.home2_removebg_preview1;
            this.pbHome.Location = new System.Drawing.Point(23, 16);
            this.pbHome.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pbHome.Name = "pbHome";
            this.pbHome.Size = new System.Drawing.Size(120, 108);
            this.pbHome.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbHome.TabIndex = 35;
            this.pbHome.TabStop = false;
            // 
            // pbUserRegistro
            // 
            this.pbUserRegistro.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(4)))), ((int)(((byte)(37)))), ((int)(((byte)(91)))));
            this.pbUserRegistro.Image = global::LP2Clinica.Properties.Resources.user3;
            this.pbUserRegistro.Location = new System.Drawing.Point(307, 98);
            this.pbUserRegistro.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pbUserRegistro.Name = "pbUserRegistro";
            this.pbUserRegistro.Size = new System.Drawing.Size(237, 213);
            this.pbUserRegistro.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbUserRegistro.TabIndex = 34;
            this.pbUserRegistro.TabStop = false;
            // 
            // frmRegistroMedico
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_3;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(821, 714);
            this.Controls.Add(this.btnConfirmar);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.pRegistro);
            this.Controls.Add(this.pbHome);
            this.Controls.Add(this.pbUserRegistro);
            this.DoubleBuffered = true;
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "frmRegistroMedico";
            this.Text = "Registrar Médico";
            this.pRegistro.ResumeLayout(false);
            this.pRegistro.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbPaciente)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbUserRegistro)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnConfirmar;
        private System.Windows.Forms.Button btnCancelar;
        private System.Windows.Forms.Panel pRegistro;
        private System.Windows.Forms.ComboBox cbEspecialidad;
        private System.Windows.Forms.PictureBox pbPaciente;
        private System.Windows.Forms.Label lblEspecialidad;
        private System.Windows.Forms.TextBox txtContraseña;
        private System.Windows.Forms.TextBox txtUsername;
        private System.Windows.Forms.Label lblContraseña;
        private System.Windows.Forms.Label lblUsername;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.Label lblEmail;
        private System.Windows.Forms.PictureBox pbHome;
        private System.Windows.Forms.PictureBox pbUserRegistro;
        private System.Windows.Forms.TextBox txtIDAdmin;
        private System.Windows.Forms.Label lblAdministrador;
    }
}