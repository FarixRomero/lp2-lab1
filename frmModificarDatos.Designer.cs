namespace LP2Clinica
{
    partial class frmModificarDatos
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
            this.bnCancelar = new System.Windows.Forms.Button();
            this.btnConfirmar = new System.Windows.Forms.Button();
            this.pModificar = new System.Windows.Forms.Panel();
            this.txtContraseña = new System.Windows.Forms.TextBox();
            this.txtUsername = new System.Windows.Forms.TextBox();
            this.lblContraseña = new System.Windows.Forms.Label();
            this.lblUsername = new System.Windows.Forms.Label();
            this.txtEmail = new System.Windows.Forms.TextBox();
            this.lblEmail = new System.Windows.Forms.Label();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.btnModificarContra = new System.Windows.Forms.Button();
            this.pModificar.SuspendLayout();
            this.SuspendLayout();
            // 
            // bnCancelar
            // 
            this.bnCancelar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.bnCancelar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.bnCancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.bnCancelar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.bnCancelar.ForeColor = System.Drawing.Color.White;
            this.bnCancelar.Location = new System.Drawing.Point(258, 571);
            this.bnCancelar.Margin = new System.Windows.Forms.Padding(4);
            this.bnCancelar.Name = "bnCancelar";
            this.bnCancelar.Size = new System.Drawing.Size(280, 41);
            this.bnCancelar.TabIndex = 28;
            this.bnCancelar.Text = "Cancelar";
            this.bnCancelar.UseVisualStyleBackColor = false;
            this.bnCancelar.Click += new System.EventHandler(this.bnCancelar_Click);
            // 
            // btnConfirmar
            // 
            this.btnConfirmar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnConfirmar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnConfirmar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnConfirmar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConfirmar.ForeColor = System.Drawing.Color.White;
            this.btnConfirmar.Location = new System.Drawing.Point(94, 294);
            this.btnConfirmar.Margin = new System.Windows.Forms.Padding(4);
            this.btnConfirmar.Name = "btnConfirmar";
            this.btnConfirmar.Size = new System.Drawing.Size(280, 41);
            this.btnConfirmar.TabIndex = 27;
            this.btnConfirmar.Text = "Confirmar";
            this.btnConfirmar.UseVisualStyleBackColor = false;
            this.btnConfirmar.Click += new System.EventHandler(this.btnConfirmar_Click);
            // 
            // pModificar
            // 
            this.pModificar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(62)))), ((int)(((byte)(114)))));
            this.pModificar.Controls.Add(this.txtContraseña);
            this.pModificar.Controls.Add(this.txtUsername);
            this.pModificar.Controls.Add(this.btnConfirmar);
            this.pModificar.Controls.Add(this.lblContraseña);
            this.pModificar.Controls.Add(this.lblUsername);
            this.pModificar.Controls.Add(this.txtEmail);
            this.pModificar.Controls.Add(this.lblEmail);
            this.pModificar.Location = new System.Drawing.Point(157, 94);
            this.pModificar.Margin = new System.Windows.Forms.Padding(4);
            this.pModificar.Name = "pModificar";
            this.pModificar.Size = new System.Drawing.Size(469, 364);
            this.pModificar.TabIndex = 26;
            this.pModificar.Paint += new System.Windows.Forms.PaintEventHandler(this.pModificar_Paint);
            // 
            // txtContraseña
            // 
            this.txtContraseña.BackColor = System.Drawing.Color.LightGray;
            this.txtContraseña.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtContraseña.Location = new System.Drawing.Point(69, 226);
            this.txtContraseña.Margin = new System.Windows.Forms.Padding(4);
            this.txtContraseña.Name = "txtContraseña";
            this.txtContraseña.Size = new System.Drawing.Size(334, 22);
            this.txtContraseña.TabIndex = 26;
            // 
            // txtUsername
            // 
            this.txtUsername.BackColor = System.Drawing.Color.LightGray;
            this.txtUsername.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtUsername.Location = new System.Drawing.Point(69, 140);
            this.txtUsername.Margin = new System.Windows.Forms.Padding(4);
            this.txtUsername.Name = "txtUsername";
            this.txtUsername.Size = new System.Drawing.Size(334, 22);
            this.txtUsername.TabIndex = 25;
            // 
            // lblContraseña
            // 
            this.lblContraseña.AutoSize = true;
            this.lblContraseña.BackColor = System.Drawing.Color.Transparent;
            this.lblContraseña.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblContraseña.ForeColor = System.Drawing.Color.White;
            this.lblContraseña.Location = new System.Drawing.Point(64, 194);
            this.lblContraseña.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblContraseña.Name = "lblContraseña";
            this.lblContraseña.Size = new System.Drawing.Size(209, 28);
            this.lblContraseña.TabIndex = 24;
            this.lblContraseña.Text = "Ingrese contraseña:";
            // 
            // lblUsername
            // 
            this.lblUsername.AutoSize = true;
            this.lblUsername.BackColor = System.Drawing.Color.Transparent;
            this.lblUsername.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblUsername.ForeColor = System.Drawing.Color.White;
            this.lblUsername.Location = new System.Drawing.Point(64, 108);
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
            this.txtEmail.Location = new System.Drawing.Point(69, 67);
            this.txtEmail.Margin = new System.Windows.Forms.Padding(4);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(334, 22);
            this.txtEmail.TabIndex = 22;
            // 
            // lblEmail
            // 
            this.lblEmail.AutoSize = true;
            this.lblEmail.BackColor = System.Drawing.Color.Transparent;
            this.lblEmail.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEmail.ForeColor = System.Drawing.Color.White;
            this.lblEmail.Location = new System.Drawing.Point(64, 35);
            this.lblEmail.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblEmail.Name = "lblEmail";
            this.lblEmail.Size = new System.Drawing.Size(74, 28);
            this.lblEmail.TabIndex = 21;
            this.lblEmail.Text = "Email:";
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(4)))), ((int)(((byte)(37)))), ((int)(((byte)(91)))));
            this.lblTitulo.Font = new System.Drawing.Font("Tw Cen MT Condensed Extra Bold", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.Color.White;
            this.lblTitulo.Location = new System.Drawing.Point(248, 30);
            this.lblTitulo.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(283, 51);
            this.lblTitulo.TabIndex = 72;
            this.lblTitulo.Text = "Modificar datos";
            this.lblTitulo.Click += new System.EventHandler(this.lblTitulo_Click);
            // 
            // btnModificarContra
            // 
            this.btnModificarContra.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnModificarContra.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnModificarContra.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnModificarContra.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnModificarContra.ForeColor = System.Drawing.Color.White;
            this.btnModificarContra.Location = new System.Drawing.Point(258, 501);
            this.btnModificarContra.Margin = new System.Windows.Forms.Padding(4);
            this.btnModificarContra.Name = "btnModificarContra";
            this.btnModificarContra.Size = new System.Drawing.Size(280, 41);
            this.btnModificarContra.TabIndex = 28;
            this.btnModificarContra.Text = "Modificar Contraseña";
            this.btnModificarContra.UseVisualStyleBackColor = false;
            this.btnModificarContra.Click += new System.EventHandler(this.btnModificarContra_Click);
            // 
            // frmModificarDatos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoValidate = System.Windows.Forms.AutoValidate.EnablePreventFocusChange;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(37)))), ((int)(((byte)(91)))));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(815, 654);
            this.Controls.Add(this.btnModificarContra);
            this.Controls.Add(this.lblTitulo);
            this.Controls.Add(this.bnCancelar);
            this.Controls.Add(this.pModificar);
            this.Cursor = System.Windows.Forms.Cursors.Default;
            this.DoubleBuffered = true;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "frmModificarDatos";
            this.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.Text = "Modificar Datos";
            this.pModificar.ResumeLayout(false);
            this.pModificar.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button bnCancelar;
        private System.Windows.Forms.Button btnConfirmar;
        private System.Windows.Forms.Panel pModificar;
        private System.Windows.Forms.TextBox txtContraseña;
        private System.Windows.Forms.TextBox txtUsername;
        private System.Windows.Forms.Label lblContraseña;
        private System.Windows.Forms.Label lblUsername;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.Label lblEmail;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Button btnModificarContra;
    }
}