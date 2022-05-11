namespace LP2Clinica
{
    partial class frmRecuperarPassword
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
            this.pbCandado = new System.Windows.Forms.PictureBox();
            this.pContraseña = new System.Windows.Forms.Panel();
            this.txtContraseñaConfirmada = new System.Windows.Forms.TextBox();
            this.lblContraseñaConfirmada = new System.Windows.Forms.Label();
            this.txtContraseñaNueva = new System.Windows.Forms.TextBox();
            this.lblContraseñaNueva = new System.Windows.Forms.Label();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.btnConfirmar = new System.Windows.Forms.Button();
            this.pbHome = new System.Windows.Forms.PictureBox();
            this.lblEmail = new System.Windows.Forms.Label();
            this.lblContraseñaActual = new System.Windows.Forms.Label();
            this.txtContraseñaActual = new System.Windows.Forms.TextBox();
            this.txtEmail = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.pbCandado)).BeginInit();
            this.pContraseña.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).BeginInit();
            this.SuspendLayout();
            // 
            // pbCandado
            // 
            this.pbCandado.BackColor = System.Drawing.Color.Transparent;
            this.pbCandado.Image = global::LP2Clinica.Properties.Resources.candado_removebg_preview;
            this.pbCandado.Location = new System.Drawing.Point(203, 53);
            this.pbCandado.Name = "pbCandado";
            this.pbCandado.Size = new System.Drawing.Size(193, 183);
            this.pbCandado.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbCandado.TabIndex = 0;
            this.pbCandado.TabStop = false;
            // 
            // pContraseña
            // 
            this.pContraseña.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(62)))), ((int)(((byte)(114)))));
            this.pContraseña.Controls.Add(this.txtEmail);
            this.pContraseña.Controls.Add(this.txtContraseñaActual);
            this.pContraseña.Controls.Add(this.lblContraseñaActual);
            this.pContraseña.Controls.Add(this.lblEmail);
            this.pContraseña.Controls.Add(this.txtContraseñaConfirmada);
            this.pContraseña.Controls.Add(this.lblContraseñaConfirmada);
            this.pContraseña.Controls.Add(this.txtContraseñaNueva);
            this.pContraseña.Controls.Add(this.lblContraseñaNueva);
            this.pContraseña.Location = new System.Drawing.Point(27, 252);
            this.pContraseña.Name = "pContraseña";
            this.pContraseña.Size = new System.Drawing.Size(553, 213);
            this.pContraseña.TabIndex = 17;
            // 
            // txtContraseñaConfirmada
            // 
            this.txtContraseñaConfirmada.BackColor = System.Drawing.Color.LightGray;
            this.txtContraseñaConfirmada.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtContraseñaConfirmada.Location = new System.Drawing.Point(271, 174);
            this.txtContraseñaConfirmada.Name = "txtContraseñaConfirmada";
            this.txtContraseñaConfirmada.Size = new System.Drawing.Size(251, 20);
            this.txtContraseñaConfirmada.TabIndex = 25;
            // 
            // lblContraseñaConfirmada
            // 
            this.lblContraseñaConfirmada.AutoSize = true;
            this.lblContraseñaConfirmada.BackColor = System.Drawing.Color.Transparent;
            this.lblContraseñaConfirmada.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblContraseñaConfirmada.ForeColor = System.Drawing.Color.White;
            this.lblContraseñaConfirmada.Location = new System.Drawing.Point(26, 172);
            this.lblContraseñaConfirmada.Name = "lblContraseñaConfirmada";
            this.lblContraseñaConfirmada.Size = new System.Drawing.Size(239, 22);
            this.lblContraseñaConfirmada.TabIndex = 23;
            this.lblContraseñaConfirmada.Text = "Confirmar nueva contraseña:";
            // 
            // txtContraseñaNueva
            // 
            this.txtContraseñaNueva.BackColor = System.Drawing.Color.LightGray;
            this.txtContraseñaNueva.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtContraseñaNueva.Location = new System.Drawing.Point(271, 132);
            this.txtContraseñaNueva.Name = "txtContraseñaNueva";
            this.txtContraseñaNueva.Size = new System.Drawing.Size(252, 20);
            this.txtContraseñaNueva.TabIndex = 22;
            // 
            // lblContraseñaNueva
            // 
            this.lblContraseñaNueva.AutoSize = true;
            this.lblContraseñaNueva.BackColor = System.Drawing.Color.Transparent;
            this.lblContraseñaNueva.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblContraseñaNueva.ForeColor = System.Drawing.Color.White;
            this.lblContraseñaNueva.Location = new System.Drawing.Point(26, 132);
            this.lblContraseñaNueva.Name = "lblContraseñaNueva";
            this.lblContraseñaNueva.Size = new System.Drawing.Size(161, 22);
            this.lblContraseñaNueva.TabIndex = 21;
            this.lblContraseñaNueva.Text = "Contraseña Nueva:";
            // 
            // btnCancelar
            // 
            this.btnCancelar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnCancelar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnCancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCancelar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCancelar.ForeColor = System.Drawing.Color.White;
            this.btnCancelar.Location = new System.Drawing.Point(27, 507);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(158, 33);
            this.btnCancelar.TabIndex = 26;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = false;
            // 
            // btnConfirmar
            // 
            this.btnConfirmar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnConfirmar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnConfirmar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnConfirmar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConfirmar.ForeColor = System.Drawing.Color.White;
            this.btnConfirmar.Location = new System.Drawing.Point(422, 507);
            this.btnConfirmar.Name = "btnConfirmar";
            this.btnConfirmar.Size = new System.Drawing.Size(158, 33);
            this.btnConfirmar.TabIndex = 27;
            this.btnConfirmar.Text = "Confirmar";
            this.btnConfirmar.UseVisualStyleBackColor = false;
            // 
            // pbHome
            // 
            this.pbHome.BackColor = System.Drawing.Color.Transparent;
            this.pbHome.Image = global::LP2Clinica.Properties.Resources.home2_removebg_preview1;
            this.pbHome.Location = new System.Drawing.Point(8, 3);
            this.pbHome.Name = "pbHome";
            this.pbHome.Size = new System.Drawing.Size(90, 88);
            this.pbHome.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbHome.TabIndex = 29;
            this.pbHome.TabStop = false;
            // 
            // lblEmail
            // 
            this.lblEmail.AutoSize = true;
            this.lblEmail.BackColor = System.Drawing.Color.Transparent;
            this.lblEmail.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEmail.ForeColor = System.Drawing.Color.White;
            this.lblEmail.Location = new System.Drawing.Point(27, 38);
            this.lblEmail.Name = "lblEmail";
            this.lblEmail.Size = new System.Drawing.Size(59, 22);
            this.lblEmail.TabIndex = 27;
            this.lblEmail.Text = "Email:";
            // 
            // lblContraseñaActual
            // 
            this.lblContraseñaActual.AutoSize = true;
            this.lblContraseñaActual.BackColor = System.Drawing.Color.Transparent;
            this.lblContraseñaActual.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblContraseñaActual.ForeColor = System.Drawing.Color.White;
            this.lblContraseñaActual.Location = new System.Drawing.Point(27, 83);
            this.lblContraseñaActual.Name = "lblContraseñaActual";
            this.lblContraseñaActual.Size = new System.Drawing.Size(160, 22);
            this.lblContraseñaActual.TabIndex = 28;
            this.lblContraseñaActual.Text = "Contraseña Actual:";
            // 
            // txtContraseñaActual
            // 
            this.txtContraseñaActual.BackColor = System.Drawing.Color.LightGray;
            this.txtContraseñaActual.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtContraseñaActual.Location = new System.Drawing.Point(271, 87);
            this.txtContraseñaActual.Name = "txtContraseñaActual";
            this.txtContraseñaActual.Size = new System.Drawing.Size(252, 20);
            this.txtContraseñaActual.TabIndex = 29;
            // 
            // txtEmail
            // 
            this.txtEmail.BackColor = System.Drawing.Color.LightGray;
            this.txtEmail.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtEmail.Location = new System.Drawing.Point(271, 42);
            this.txtEmail.Name = "txtEmail";
            this.txtEmail.Size = new System.Drawing.Size(252, 20);
            this.txtEmail.TabIndex = 30;
            // 
            // frmRecuperarPassword
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_3;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(616, 580);
            this.Controls.Add(this.pbHome);
            this.Controls.Add(this.btnConfirmar);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.pContraseña);
            this.Controls.Add(this.pbCandado);
            this.DoubleBuffered = true;
            this.Name = "frmRecuperarPassword";
            ((System.ComponentModel.ISupportInitialize)(this.pbCandado)).EndInit();
            this.pContraseña.ResumeLayout(false);
            this.pContraseña.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pbCandado;
        private System.Windows.Forms.Panel pContraseña;
        private System.Windows.Forms.TextBox txtContraseñaConfirmada;
        private System.Windows.Forms.Label lblContraseñaConfirmada;
        private System.Windows.Forms.TextBox txtContraseñaNueva;
        private System.Windows.Forms.Label lblContraseñaNueva;
        private System.Windows.Forms.Button btnCancelar;
        private System.Windows.Forms.Button btnConfirmar;
        private System.Windows.Forms.PictureBox pbHome;
        private System.Windows.Forms.TextBox txtEmail;
        private System.Windows.Forms.TextBox txtContraseñaActual;
        private System.Windows.Forms.Label lblContraseñaActual;
        private System.Windows.Forms.Label lblEmail;
    }
}