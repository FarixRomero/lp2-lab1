namespace LP2Clinica
{
    partial class frmCambiarContraseña
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
            this.pCambiarContraseña = new System.Windows.Forms.Panel();
            this.btnLogin = new System.Windows.Forms.Button();
            this.txtUsername = new System.Windows.Forms.TextBox();
            this.lblEmail = new System.Windows.Forms.Label();
            this.lblPassword = new System.Windows.Forms.Label();
            this.txtEmail = new System.Windows.Forms.TextBox();
            this.btnCambiar = new System.Windows.Forms.Button();
            this.pbUserMensaje = new System.Windows.Forms.PictureBox();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.pbHome = new System.Windows.Forms.PictureBox();
            this.pCambiarContraseña.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbUserMensaje)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).BeginInit();
            this.SuspendLayout();
            // 
            // pCambiarContraseña
            // 
            this.pCambiarContraseña.AutoScrollMargin = new System.Drawing.Size(3, 3);
            this.pCambiarContraseña.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(62)))), ((int)(((byte)(114)))));
            this.pCambiarContraseña.Controls.Add(this.btnLogin);
            this.pCambiarContraseña.Controls.Add(this.txtUsername);
            this.pCambiarContraseña.Controls.Add(this.lblEmail);
            this.pCambiarContraseña.Controls.Add(this.lblPassword);
            this.pCambiarContraseña.Controls.Add(this.txtEmail);
            this.pCambiarContraseña.Location = new System.Drawing.Point(121, 305);
            this.pCambiarContraseña.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.pCambiarContraseña.Name = "pCambiarContraseña";
            this.pCambiarContraseña.Size = new System.Drawing.Size(579, 236);
            this.pCambiarContraseña.TabIndex = 18;
            // 
            // btnLogin
            // 
            this.btnLogin.BackColor = System.Drawing.Color.DarkSlateGray;
            this.btnLogin.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnLogin.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLogin.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLogin.ForeColor = System.Drawing.Color.White;
            this.btnLogin.Location = new System.Drawing.Point(359, 73);
            this.btnLogin.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnLogin.Name = "btnLogin";
            this.btnLogin.Size = new System.Drawing.Size(204, 37);
            this.btnLogin.TabIndex = 24;
            this.btnLogin.Text = "Enviar Código";
            this.btnLogin.UseVisualStyleBackColor = false;
            // 
            // txtUsername
            // 
            this.txtUsername.BackColor = System.Drawing.Color.LightGray;
            this.txtUsername.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtUsername.Location = new System.Drawing.Point(52, 82);
            this.txtUsername.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtUsername.Name = "txtUsername";
            this.txtUsername.Size = new System.Drawing.Size(298, 22);
            this.txtUsername.TabIndex = 17;
            // 
            // lblEmail
            // 
            this.lblEmail.AutoSize = true;
            this.lblEmail.BackColor = System.Drawing.Color.Transparent;
            this.lblEmail.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEmail.ForeColor = System.Drawing.Color.White;
            this.lblEmail.Location = new System.Drawing.Point(47, 50);
            this.lblEmail.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblEmail.Name = "lblEmail";
            this.lblEmail.Size = new System.Drawing.Size(74, 28);
            this.lblEmail.TabIndex = 20;
            this.lblEmail.Text = "Email:";
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.BackColor = System.Drawing.Color.Transparent;
            this.lblPassword.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPassword.ForeColor = System.Drawing.Color.White;
            this.lblPassword.Location = new System.Drawing.Point(47, 124);
            this.lblPassword.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(259, 28);
            this.lblPassword.TabIndex = 22;
            this.lblPassword.Text = "Codigo de confirmación:";
            // 
            // txtEmail
            // 
            this.txtEmail.BackColor = System.Drawing.Color.LightGray;
            this.txtEmail.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtEmail.Location = new System.Drawing.Point(52, 166);
            this.txtEmail.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(298, 22);
            this.txtEmail.TabIndex = 16;
            // 
            // btnCambiar
            // 
            this.btnCambiar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnCambiar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnCambiar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCambiar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCambiar.ForeColor = System.Drawing.Color.White;
            this.btnCambiar.Location = new System.Drawing.Point(576, 599);
            this.btnCambiar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnCambiar.Name = "btnCambiar";
            this.btnCambiar.Size = new System.Drawing.Size(211, 57);
            this.btnCambiar.TabIndex = 23;
            this.btnCambiar.Text = "Cambiar";
            this.btnCambiar.UseVisualStyleBackColor = false;
            // 
            // pbUserMensaje
            // 
            this.pbUserMensaje.BackColor = System.Drawing.Color.Transparent;
            this.pbUserMensaje.Image = global::LP2Clinica.Properties.Resources.icono_del_usuario_mensaje_correo_sobre_electrónico_110413673_removebg_preview;
            this.pbUserMensaje.Location = new System.Drawing.Point(297, 44);
            this.pbUserMensaje.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pbUserMensaje.Name = "pbUserMensaje";
            this.pbUserMensaje.Size = new System.Drawing.Size(256, 276);
            this.pbUserMensaje.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbUserMensaje.TabIndex = 24;
            this.pbUserMensaje.TabStop = false;
            // 
            // btnCancelar
            // 
            this.btnCancelar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnCancelar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnCancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCancelar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCancelar.ForeColor = System.Drawing.Color.White;
            this.btnCancelar.Location = new System.Drawing.Point(51, 599);
            this.btnCancelar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(211, 57);
            this.btnCancelar.TabIndex = 27;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = false;
            // 
            // pbHome
            // 
            this.pbHome.BackColor = System.Drawing.Color.Transparent;
            this.pbHome.Image = global::LP2Clinica.Properties.Resources.home2_removebg_preview1;
            this.pbHome.Location = new System.Drawing.Point(16, -1);
            this.pbHome.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.pbHome.Name = "pbHome";
            this.pbHome.Size = new System.Drawing.Size(101, 94);
            this.pbHome.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbHome.TabIndex = 28;
            this.pbHome.TabStop = false;
            // 
            // frmCambiarContraseña
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_3;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(821, 714);
            this.Controls.Add(this.pbHome);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.pCambiarContraseña);
            this.Controls.Add(this.pbUserMensaje);
            this.Controls.Add(this.btnCambiar);
            this.DoubleBuffered = true;
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "frmCambiarContraseña";
            this.Text = "frmCambiarContraseña";
            this.pCambiarContraseña.ResumeLayout(false);
            this.pCambiarContraseña.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbUserMensaje)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pCambiarContraseña;
        private System.Windows.Forms.Button btnCambiar;
        private System.Windows.Forms.Label lblPassword;
        private System.Windows.Forms.Label lblEmail;
        private System.Windows.Forms.TextBox txtUsername;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.PictureBox pbUserMensaje;
        private System.Windows.Forms.Button btnLogin;
        private System.Windows.Forms.Button btnCancelar;
        private System.Windows.Forms.PictureBox pbHome;
    }
}