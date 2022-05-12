namespace LP2Clinica
{
    partial class PrincipalClinica
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
            this.panelContenedor = new System.Windows.Forms.Panel();
            this.panel1 = new System.Windows.Forms.Panel();
            this.btnCerrarSesion = new System.Windows.Forms.Button();
            this.btnVerPerfil = new System.Windows.Forms.Button();
            this.lblCambiarPassword = new System.Windows.Forms.Label();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.btnBuscarMedico = new System.Windows.Forms.Button();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.btnAdministrarCitas = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.btnRegistrarCita = new System.Windows.Forms.Button();
            this.btnAdministrarMedicos = new System.Windows.Forms.Button();
            this.btnAdministrarPacientes = new System.Windows.Forms.Button();
            this.btnBuscarPaciente = new System.Windows.Forms.Button();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // panelContenedor
            // 
            this.panelContenedor.Location = new System.Drawing.Point(335, 0);
            this.panelContenedor.Name = "panelContenedor";
            this.panelContenedor.Size = new System.Drawing.Size(815, 654);
            this.panelContenedor.TabIndex = 8;
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(62)))), ((int)(((byte)(114)))));
            this.panel1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.panel1.Controls.Add(this.btnAdministrarPacientes);
            this.panel1.Controls.Add(this.btnBuscarPaciente);
            this.panel1.Controls.Add(this.btnAdministrarMedicos);
            this.panel1.Controls.Add(this.btnAdministrarCitas);
            this.panel1.Controls.Add(this.panelContenedor);
            this.panel1.Controls.Add(this.btnCerrarSesion);
            this.panel1.Controls.Add(this.btnVerPerfil);
            this.panel1.Controls.Add(this.lblCambiarPassword);
            this.panel1.Controls.Add(this.pictureBox3);
            this.panel1.Controls.Add(this.btnBuscarMedico);
            this.panel1.Controls.Add(this.pictureBox2);
            this.panel1.Controls.Add(this.pictureBox1);
            this.panel1.Controls.Add(this.btnRegistrarCita);
            this.panel1.Location = new System.Drawing.Point(1, 1);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(329, 656);
            this.panel1.TabIndex = 7;
            // 
            // btnCerrarSesion
            // 
            this.btnCerrarSesion.BackColor = System.Drawing.Color.PowderBlue;
            this.btnCerrarSesion.Location = new System.Drawing.Point(143, 159);
            this.btnCerrarSesion.Name = "btnCerrarSesion";
            this.btnCerrarSesion.Size = new System.Drawing.Size(140, 31);
            this.btnCerrarSesion.TabIndex = 22;
            this.btnCerrarSesion.Text = "Cerrar Sesion";
            this.btnCerrarSesion.UseVisualStyleBackColor = false;
            this.btnCerrarSesion.Click += new System.EventHandler(this.btnCerrarSesion_Click);
            // 
            // btnVerPerfil
            // 
            this.btnVerPerfil.BackColor = System.Drawing.Color.PowderBlue;
            this.btnVerPerfil.Location = new System.Drawing.Point(143, 122);
            this.btnVerPerfil.Name = "btnVerPerfil";
            this.btnVerPerfil.Size = new System.Drawing.Size(140, 31);
            this.btnVerPerfil.TabIndex = 21;
            this.btnVerPerfil.Text = "Ver Perfil";
            this.btnVerPerfil.UseVisualStyleBackColor = false;
            this.btnVerPerfil.Click += new System.EventHandler(this.btnVerPerfil_Click);
            // 
            // lblCambiarPassword
            // 
            this.lblCambiarPassword.AutoSize = true;
            this.lblCambiarPassword.BackColor = System.Drawing.Color.Transparent;
            this.lblCambiarPassword.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCambiarPassword.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(255)))), ((int)(((byte)(240)))));
            this.lblCambiarPassword.Location = new System.Drawing.Point(146, 97);
            this.lblCambiarPassword.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblCambiarPassword.Name = "lblCambiarPassword";
            this.lblCambiarPassword.Size = new System.Drawing.Size(107, 22);
            this.lblCambiarPassword.TabIndex = 20;
            this.lblCambiarPassword.Text = "Bienvenid@";
            // 
            // pictureBox3
            // 
            this.pictureBox3.BackgroundImage = global::LP2Clinica.Properties.Resources.user3;
            this.pictureBox3.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.pictureBox3.Location = new System.Drawing.Point(29, 112);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(108, 88);
            this.pictureBox3.TabIndex = 7;
            this.pictureBox3.TabStop = false;
            // 
            // btnBuscarMedico
            // 
            this.btnBuscarMedico.BackColor = System.Drawing.Color.PowderBlue;
            this.btnBuscarMedico.ImageKey = "(ninguno)";
            this.btnBuscarMedico.Location = new System.Drawing.Point(33, 480);
            this.btnBuscarMedico.Name = "btnBuscarMedico";
            this.btnBuscarMedico.Size = new System.Drawing.Size(267, 54);
            this.btnBuscarMedico.TabIndex = 6;
            this.btnBuscarMedico.Text = "Buscar Medico";
            this.btnBuscarMedico.UseVisualStyleBackColor = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackgroundImage = global::LP2Clinica.Properties.Resources.QHALI;
            this.pictureBox2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.pictureBox2.Location = new System.Drawing.Point(49, 23);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(221, 42);
            this.pictureBox2.TabIndex = 5;
            this.pictureBox2.TabStop = false;
            // 
            // btnAdministrarCitas
            // 
            this.btnAdministrarCitas.BackColor = System.Drawing.Color.PowderBlue;
            this.btnAdministrarCitas.Location = new System.Drawing.Point(33, 292);
            this.btnAdministrarCitas.Name = "btnAdministrarCitas";
            this.btnAdministrarCitas.Size = new System.Drawing.Size(267, 56);
            this.btnAdministrarCitas.TabIndex = 4;
            this.btnAdministrarCitas.Text = "Administrar Citas";
            this.btnAdministrarCitas.UseVisualStyleBackColor = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackgroundImage = global::LP2Clinica.Properties.Resources.bone_2;
            this.pictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.pictureBox1.Location = new System.Drawing.Point(0, 344);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(329, 312);
            this.pictureBox1.TabIndex = 3;
            this.pictureBox1.TabStop = false;
            // 
            // btnRegistrarCita
            // 
            this.btnRegistrarCita.BackColor = System.Drawing.Color.PowderBlue;
            this.btnRegistrarCita.Location = new System.Drawing.Point(33, 230);
            this.btnRegistrarCita.Name = "btnRegistrarCita";
            this.btnRegistrarCita.Size = new System.Drawing.Size(267, 56);
            this.btnRegistrarCita.TabIndex = 1;
            this.btnRegistrarCita.Text = "Registrar cita";
            this.btnRegistrarCita.UseVisualStyleBackColor = false;
            // 
            // btnAdministrarMedicos
            // 
            this.btnAdministrarMedicos.BackColor = System.Drawing.Color.PowderBlue;
            this.btnAdministrarMedicos.ImageKey = "(ninguno)";
            this.btnAdministrarMedicos.Location = new System.Drawing.Point(33, 540);
            this.btnAdministrarMedicos.Name = "btnAdministrarMedicos";
            this.btnAdministrarMedicos.Size = new System.Drawing.Size(267, 54);
            this.btnAdministrarMedicos.TabIndex = 23;
            this.btnAdministrarMedicos.Text = "Administrar Medicos";
            this.btnAdministrarMedicos.UseVisualStyleBackColor = false;
            // 
            // btnAdministrarPacientes
            // 
            this.btnAdministrarPacientes.BackColor = System.Drawing.Color.PowderBlue;
            this.btnAdministrarPacientes.Location = new System.Drawing.Point(33, 418);
            this.btnAdministrarPacientes.Name = "btnAdministrarPacientes";
            this.btnAdministrarPacientes.Size = new System.Drawing.Size(267, 56);
            this.btnAdministrarPacientes.TabIndex = 25;
            this.btnAdministrarPacientes.Text = "Administrar Pacientes";
            this.btnAdministrarPacientes.UseVisualStyleBackColor = false;
            // 
            // btnBuscarPaciente
            // 
            this.btnBuscarPaciente.BackColor = System.Drawing.Color.PowderBlue;
            this.btnBuscarPaciente.Location = new System.Drawing.Point(33, 356);
            this.btnBuscarPaciente.Name = "btnBuscarPaciente";
            this.btnBuscarPaciente.Size = new System.Drawing.Size(267, 56);
            this.btnBuscarPaciente.TabIndex = 24;
            this.btnBuscarPaciente.Text = "Buscar paciente";
            this.btnBuscarPaciente.UseVisualStyleBackColor = false;
            // 
            // PrincipalClinica
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(2)))), ((int)(((byte)(64)))), ((int)(((byte)(91)))));
            this.ClientSize = new System.Drawing.Size(1144, 659);
            this.Controls.Add(this.panel1);
            this.Name = "PrincipalClinica";
            this.Text = "PrincipalClinica";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panelContenedor;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button btnCerrarSesion;
        private System.Windows.Forms.Button btnVerPerfil;
        private System.Windows.Forms.Label lblCambiarPassword;
        private System.Windows.Forms.PictureBox pictureBox3;
        private System.Windows.Forms.Button btnBuscarMedico;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Button btnAdministrarCitas;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button btnRegistrarCita;
        private System.Windows.Forms.Button btnAdministrarMedicos;
        private System.Windows.Forms.Button btnAdministrarPacientes;
        private System.Windows.Forms.Button btnBuscarPaciente;
    }
}