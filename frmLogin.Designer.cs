namespace LP2Clinica
{
    partial class frmLogin
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
            this.btnRegistro = new System.Windows.Forms.Button();
            this.pIniciarSesion = new System.Windows.Forms.Panel();
            this.btnLogin = new System.Windows.Forms.Button();
            this.lblPassword = new System.Windows.Forms.Label();
            this.lblUsername = new System.Windows.Forms.Label();
            this.lblCambiarPassword = new System.Windows.Forms.Label();
            this.txtPassword = new System.Windows.Forms.TextBox();
            this.txtUsername = new System.Windows.Forms.TextBox();
            this.pIniciarSesion.SuspendLayout();
            this.SuspendLayout();
            // 
            // btnRegistro
            // 
            this.btnRegistro.BackColor = System.Drawing.Color.Transparent;
            this.btnRegistro.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.btnRegistro.FlatAppearance.BorderColor = System.Drawing.Color.White;
            this.btnRegistro.FlatAppearance.BorderSize = 0;
            this.btnRegistro.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnRegistro.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRegistro.ForeColor = System.Drawing.Color.White;
            this.btnRegistro.Location = new System.Drawing.Point(246, 485);
            this.btnRegistro.Name = "btnRegistro";
            this.btnRegistro.Size = new System.Drawing.Size(158, 45);
            this.btnRegistro.TabIndex = 16;
            this.btnRegistro.Text = "Registrarse";
            this.btnRegistro.UseVisualStyleBackColor = false;
            this.btnRegistro.Click += new System.EventHandler(this.btnRegistro_Click);
            // 
            // pIniciarSesion
            // 
            this.pIniciarSesion.AutoScrollMargin = new System.Drawing.Size(3, 3);
            this.pIniciarSesion.BackColor = System.Drawing.Color.Transparent;
            this.pIniciarSesion.Controls.Add(this.btnLogin);
            this.pIniciarSesion.Controls.Add(this.lblPassword);
            this.pIniciarSesion.Controls.Add(this.lblUsername);
            this.pIniciarSesion.Controls.Add(this.lblCambiarPassword);
            this.pIniciarSesion.Controls.Add(this.txtPassword);
            this.pIniciarSesion.Controls.Add(this.txtUsername);
            this.pIniciarSesion.Location = new System.Drawing.Point(170, 262);
            this.pIniciarSesion.Margin = new System.Windows.Forms.Padding(2);
            this.pIniciarSesion.Name = "pIniciarSesion";
            this.pIniciarSesion.Size = new System.Drawing.Size(281, 218);
            this.pIniciarSesion.TabIndex = 17;
            // 
            // btnLogin
            // 
            this.btnLogin.BackColor = System.Drawing.Color.Transparent;
            this.btnLogin.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnLogin.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLogin.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLogin.ForeColor = System.Drawing.Color.White;
            this.btnLogin.Location = new System.Drawing.Point(54, 146);
            this.btnLogin.Name = "btnLogin";
            this.btnLogin.Size = new System.Drawing.Size(158, 46);
            this.btnLogin.TabIndex = 23;
            this.btnLogin.Text = "Iniciar Sesión";
            this.btnLogin.UseVisualStyleBackColor = false;
            this.btnLogin.Click += new System.EventHandler(this.btnLogin_Click);
            // 
            // lblPassword
            // 
            this.lblPassword.AutoSize = true;
            this.lblPassword.BackColor = System.Drawing.Color.Transparent;
            this.lblPassword.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPassword.ForeColor = System.Drawing.Color.White;
            this.lblPassword.Location = new System.Drawing.Point(10, 98);
            this.lblPassword.Name = "lblPassword";
            this.lblPassword.Size = new System.Drawing.Size(72, 17);
            this.lblPassword.TabIndex = 22;
            this.lblPassword.Text = "Password:";
            // 
            // lblUsername
            // 
            this.lblUsername.AutoSize = true;
            this.lblUsername.BackColor = System.Drawing.Color.Transparent;
            this.lblUsername.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUsername.ForeColor = System.Drawing.Color.White;
            this.lblUsername.Location = new System.Drawing.Point(4, 58);
            this.lblUsername.Name = "lblUsername";
            this.lblUsername.Size = new System.Drawing.Size(75, 17);
            this.lblUsername.TabIndex = 21;
            this.lblUsername.Text = "Username:";
            // 
            // lblCambiarPassword
            // 
            this.lblCambiarPassword.AutoSize = true;
            this.lblCambiarPassword.BackColor = System.Drawing.Color.Transparent;
            this.lblCambiarPassword.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCambiarPassword.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(255)))), ((int)(((byte)(240)))));
            this.lblCambiarPassword.Location = new System.Drawing.Point(143, 120);
            this.lblCambiarPassword.Name = "lblCambiarPassword";
            this.lblCambiarPassword.Size = new System.Drawing.Size(134, 17);
            this.lblCambiarPassword.TabIndex = 19;
            this.lblCambiarPassword.Text = "Cambiar contraseña";
            this.lblCambiarPassword.Click += new System.EventHandler(this.lblCambiarPassword_Click);
            // 
            // txtPassword
            // 
            this.txtPassword.BackColor = System.Drawing.Color.LightGray;
            this.txtPassword.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtPassword.Location = new System.Drawing.Point(88, 94);
            this.txtPassword.Name = "txtPassword";
            this.txtPassword.Size = new System.Drawing.Size(189, 20);
            this.txtPassword.TabIndex = 18;
            // 
            // txtUsername
            // 
            this.txtUsername.BackColor = System.Drawing.Color.LightGray;
            this.txtUsername.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtUsername.Location = new System.Drawing.Point(88, 58);
            this.txtUsername.Name = "txtUsername";
            this.txtUsername.Size = new System.Drawing.Size(189, 20);
            this.txtUsername.TabIndex = 17;
            // 
            // frmLogin
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_2;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.ClientSize = new System.Drawing.Size(616, 580);
            this.Controls.Add(this.pIniciarSesion);
            this.Controls.Add(this.btnRegistro);
            this.DoubleBuffered = true;
            this.Name = "frmLogin";
            this.Text = "Iniciar Sesión";
            this.pIniciarSesion.ResumeLayout(false);
            this.pIniciarSesion.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button btnRegistro;
        private System.Windows.Forms.Panel pIniciarSesion;
        private System.Windows.Forms.Button btnLogin;
        private System.Windows.Forms.Label lblPassword;
        private System.Windows.Forms.Label lblUsername;
        private System.Windows.Forms.Label lblCambiarPassword;
        private System.Windows.Forms.TextBox txtPassword;
        private System.Windows.Forms.TextBox txtUsername;
    }
}